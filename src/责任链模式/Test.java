package 责任链模式;

/**
 * 责任链模式是为某个请求创建一个对象链，每个对象依次检查此请求，并对其进行处理，或者将它传给链中的下一个对象。
 *
 * 相当于一个链表的结构，链表中的每个节点都是一个对象，分别完成不同的业务功能，并且该对象中存储着下一个节点的指针。
 *
 * 当一个请求进入时，先经过第一个对象，然后再将请求传给下一个对象，以此类推，形成一个链条。
 *
 * 链条上的每个对象所承担的责任各不相同。
 *
 * 论坛用户发帖，需要屏蔽广告、敏感词，可以使用责任链模式来完成。
 */
public class Test {
    public static void main(String[] args) {
        PostHandler adHandler=new AdHandler();
        PostHandler worldHandler=new WorldHandler();
        adHandler.setNext(worldHandler);
        Post post=new Post();
        post.setContent("内容，广告，内容，敏感词");
        System.out.println("过滤前："+post.getContent());
        adHandler.handlerRequest(post);
        System.out.println("过滤后："+post.getContent());
    }
}
