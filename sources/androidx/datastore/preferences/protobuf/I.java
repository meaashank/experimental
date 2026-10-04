package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet;
import androidx.datastore.preferences.protobuf.FieldSet.b;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class I<T extends FieldSet.b<T>> {
    public abstract int a(Map.Entry<?, ?> entry);

    public abstract Object b(H h10, MessageLite messageLite, int i10);

    public abstract FieldSet<T> c(Object obj);

    public abstract FieldSet<T> d(Object obj);

    public abstract boolean e(MessageLite messageLite);

    public abstract void f(Object obj);

    public abstract <UT, UB> UB g(F0 f02, Object obj, H h10, FieldSet<T> fieldSet, UB ub2, W0<UT, UB> w02) throws IOException;

    public abstract void h(F0 f02, Object obj, H h10, FieldSet<T> fieldSet) throws IOException;

    public abstract void i(ByteString byteString, Object obj, H h10, FieldSet<T> fieldSet) throws IOException;

    public abstract void j(Writer writer, Map.Entry<?, ?> entry) throws IOException;

    public abstract void k(Object obj, FieldSet<T> fieldSet);
}
