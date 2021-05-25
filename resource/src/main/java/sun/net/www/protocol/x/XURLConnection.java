package sun.net.www.protocol.x;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Description X {@link URLConnection} 实现
 * @Author Wangkunkun
 * @Date 2021/5/26 20:54
 */
public class XURLConnection extends URLConnection {

    private ClassPathResource classPathResource;

    /**
     * Constructs a URL connection to the specified URL. A connection to
     * the object referenced by the URL is not created.
     *
     * @param url the specified URL.
     */
    protected XURLConnection(URL url) {
        super(url);
        // 直接从x://META-INFO/filename中获取path作为ClassPath
        classPathResource = new ClassPathResource(url.getPath());
    }

    @Override
    public void connect() throws IOException {

    }

    @Override
    public InputStream getInputStream() throws IOException {
        return classPathResource.getInputStream();
    }
}
