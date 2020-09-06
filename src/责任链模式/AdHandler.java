package 责任链模式;


public class AdHandler extends PostHandler {
    @Override
    public void handlerRequest(Post post) {
        String content=post.getContent();
        content=content.replace("广告","**");
        post.setContent(content);
        System.out.println("过滤了广告");
        next(post);
    }
}
