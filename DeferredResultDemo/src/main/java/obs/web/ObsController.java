package obs.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import obs.model.Message;
import obs.service.Service1;
import rx.Observable;

@RestController
public class ObsController {

    @Autowired
    private Service1 service1;

    @RequestMapping("/getAMessageObsBlocking")
    public Message getAMessageObsBlocking() {
    	System.out.println("getAMessageObsBlocking");
        return service1.getAMessageObs().toBlocking().first();
    }

    //http://localhost:8080/getAMessageObsAsync
    @RequestMapping("/getAMessageObsAsync")
    public DeferredResult<Message> getAMessageAsync() {
        Observable<Message> o = this.service1.getAMessageObs();
        DeferredResult<Message> deffered = new DeferredResult<>(90000);
        o.subscribe(m -> deffered.setResult(m), e -> deffered.setErrorResult(e));
        return deffered;
    }

    //http://localhost:8080/getMessagesObsAsync
    @RequestMapping("/getMessagesObsAsync")
    public DeferredResult<List<Message>> getMessagesAsync() {
        Observable<Message> o = this.service1.getMessagesObs();
        DeferredResult<List<Message>> deffered = new DeferredResult<>(90000);
        o.take(5).buffer(5).subscribe(m -> deffered.setResult(m), e -> deffered.setErrorResult(e));
        return deffered;
    }
    
//    @RequestMapping("/getAMessageFutureBlocking")
//    public Message getAMessageFutureBlocking() throws Exception {
//        return service1.getAMessageFuture().get();
//    }

 
    @RequestMapping("/quickMessage")
    public Message getAFastMessage() {
        return new Message("quick message");
    }
    

    

//    @RequestMapping("/getAMessageFutureAsync")
//    public DeferredResult<Message> getAMessageFutureAsync() {
//        DeferredResult<Message> deffered = new DeferredResult<>(90000);
//        CompletableFuture<Message> f = this.service1.getAMessageFuture();
//        f.whenComplete((res, ex) -> {
//            if (ex != null) {
//                deffered.setErrorResult(ex);
//            } else {
//                deffered.setResult(res);
//            }
//        });
//        return deffered;
//    }

}
