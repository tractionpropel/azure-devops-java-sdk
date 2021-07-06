package org.azd;

import org.azd.connection.Connection;
import org.azd.core.CoreApi;
import org.azd.enums.WikiType;
import org.azd.exceptions.AzDException;
import org.azd.exceptions.ConnectionException;
import org.azd.git.GitApi;
import org.azd.helpers.JsonMapper;
import org.azd.interfaces.CoreDetails;
import org.azd.interfaces.GitDetails;
import org.azd.interfaces.WikiDetails;
import org.azd.wiki.WikiApi;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class WikiApiTest {
    private static final JsonMapper MAPPER = new JsonMapper();
    private static WikiDetails w;
    private static CoreDetails c;
    private static GitDetails g;

    @Before
    public void init() throws AzDException {
        String dir = System.getProperty("user.dir");
        File file = new File(dir + "/src/test/java/org/azd/_unitTest.json");
        MockParameters m = MAPPER.mapJsonFromFile(file, MockParameters.class);
        String organization = m.getO();
        String token = m.getT();
        String project = m.getP();
        Connection connection = new Connection(organization, project, token);
        c = new CoreApi(connection);
        w = new WikiApi(connection);
        g = new GitApi(connection);
    }

    @Test
    public void shouldCreateWikiPage() throws ConnectionException, AzDException {
        var projectId = c.getProject("azure-devops-java-sdk").getId();
        var repoId = g.getRepository("testRepository").getId();

        w.createWiki("develop", WikiType.CODEWIKI, "MyProjectWiki", projectId, repoId, "/");
    }

    @Test
    public void shouldGetAWikiPage() throws ConnectionException, AzDException {
        w.getWiki("MyProjectWiki");
    }

    @Test
    public void shouldGetAllWikiPages() throws ConnectionException, AzDException {
        w.getWikis();
    }

    @Test
    public void shouldDeleteAWikiPage() throws ConnectionException, AzDException {
        System.out.println(w.deleteWiki("MyProjectWiki"));
    }
}
