package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {
    public enum MessageType{
        ENTER, TALK
    }
    private MessageType type; //메시지 타입, ENTER: 접속, TALK: 채팅
    private String roomId; //방 번호
    private String sender; //메시지를 보낸사람
    private String message; //메시지
}
