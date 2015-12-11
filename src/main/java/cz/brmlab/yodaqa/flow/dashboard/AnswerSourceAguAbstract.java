package cz.brmlab.yodaqa.flow.dashboard;

public class AnswerSourceAguAbstract extends AnswerSource {

    public static final String ORIGIN_FULL = "fulltext";
    public static final String ORIGIN_TITLE = "title-in-clue";
    public static final String ORIGIN_DOCUMENT = "document title";
    public static final String ORIGIN_ABSTRACT = "document abstract";

    public AnswerSourceAguAbstract(String origin, String title, String url) {
        super("agu abstract", origin, title, url);
    }
}
