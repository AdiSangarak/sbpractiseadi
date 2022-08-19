package in.adi.websocketapp;

import in.adi.websocketapp.hello.Greeting;
import in.adi.websocketapp.hello.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import com.tutorialspoint.websocketapp.hello.*;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {
   @MessageMapping("/hello")
   @SendTo("/topic/greetings")
   public Greeting greeting(HelloMessage message) throws Exception {
      Thread.sleep(1000); // simulated delay
      return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
   }
}