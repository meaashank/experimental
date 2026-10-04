package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.WireFormat;

/* JADX INFO: loaded from: classes2.dex */
public abstract class F<ContainingType extends MessageLite, Type> {
    public abstract Type a();

    public abstract WireFormat.FieldType b();

    public abstract MessageLite c();

    public abstract int d();

    public boolean e() {
        return true;
    }

    public abstract boolean f();
}
