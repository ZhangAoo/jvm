package 责任链模式;

public class WorldHandler extends PostHandler{
    @Override
    public void handlerRequest(Post post) {
        String content=post.getContent();
        content=content.replace("敏感词","**");
        post.setContent(content);
        System.out.println("过滤了敏感词");
        next(post);
    }
}
