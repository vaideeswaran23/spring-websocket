package com.web.socket.websocket.controller;

import com.web.socket.websocket.bean.MessageBean;
import com.web.socket.websocket.bean.VideoBean;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class SocketController {

    @MessageMapping("/user-all")
    @SendTo("/topic/user")
    public MessageBean send(@Payload MessageBean message) {
        return message;
    }

    @MessageMapping("/video-all")
    @SendTo("/topic/video")
    public VideoBean video(@Payload VideoBean message) {
        return message;
    }

    @MessageMapping("/answer-all")
    @SendTo("/topic/answer")
    public VideoBean answer(@Payload VideoBean message) {
        return message;
    }

}
