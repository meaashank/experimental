package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Value;

/* JADX INFO: loaded from: classes2.dex */
public interface b1 extends InterfaceC2535l0 {
    boolean getBoolValue();

    Value.KindCase getKindCase();

    ListValue getListValue();

    NullValue getNullValue();

    int getNullValueValue();

    double getNumberValue();

    String getStringValue();

    ByteString getStringValueBytes();

    Struct getStructValue();

    boolean hasListValue();

    boolean hasStructValue();
}
