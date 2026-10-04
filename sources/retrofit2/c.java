package retrofit2;

import java.io.IOException;
import okhttp3.Request;

/* JADX INFO: loaded from: classes8.dex */
public interface c<T> extends Cloneable {
    boolean P();

    boolean U();

    void cancel();

    /* JADX INFO: renamed from: clone */
    c<T> mo51clone();

    y<T> execute() throws IOException;

    void o(e<T> eVar);

    Request request();
}
