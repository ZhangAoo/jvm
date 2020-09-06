package 责任链模式;

public abstract class PostHandler {
    public PostHandler next;
    public void setNext(PostHandler postHandler){
        this.next=postHandler;
    }

    public abstract void handlerRequest(Post post);

    public final void next(Post post){
        if (this.next!=null){
            this.next.handlerRequest(post);
        }
    }

}
