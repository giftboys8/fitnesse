package fitnesse.wikitext.parser;

import java.util.Collection;

public interface SourcePage extends Comparable<SourcePage> {
    String getName();
    String getFullName();
    String getPath();
    String getFullPath();
    String getContent();
    boolean targetExists(String wikiWordPath);
    String makeFullPathOfTarget(String wikiWordPath);
    String findParentPath(String targetName);
    Maybe<SourcePage> findIncludedPage(String pageName);

    SourcePage getParent();

    Collection<SourcePage> getAncestors();
    Collection<SourcePage> getChildren();
    boolean hasProperty(String propertyKey);
    String getProperty(String propertyKey);
    String makeUrl(String wikiWordPath);
}
