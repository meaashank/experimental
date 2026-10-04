package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2528i;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface G0<T> {
    void a(T t10, T t11);

    boolean b(T t10);

    void c(T t10, Writer writer) throws IOException;

    void d(T t10, F0 f02, H h10) throws IOException;

    void e(T t10);

    boolean equals(T t10, T t11);

    int f(T t10);

    void g(T t10, byte[] bArr, int i10, int i11, C2528i.b bVar) throws IOException;

    int hashCode(T t10);

    T newInstance();
}
