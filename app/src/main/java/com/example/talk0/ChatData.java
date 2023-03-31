package com.example.talk0;

//public class ChatData extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_chat_data);
//    }
//}
 public class ChatData {

     private String msg;
     private String nickname;

    public String getMsg(){
        return msg;
    }
     public void setMsg(String msg){
         this.msg=msg;
     }

     public String getNickname(){
         return nickname;
     }

     public void setNickname(String nickname){
         this.nickname=nickname;
     }
}