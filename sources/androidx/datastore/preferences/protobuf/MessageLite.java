package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public interface MessageLite extends InterfaceC2535l0 {

    public interface Builder extends InterfaceC2535l0, Cloneable {
        MessageLite build();

        MessageLite buildPartial();

        Builder clear();

        /* JADX INFO: renamed from: clone */
        Builder mo7clone();

        boolean mergeDelimitedFrom(InputStream inputStream) throws IOException;

        boolean mergeDelimitedFrom(InputStream inputStream, H h10) throws IOException;

        Builder mergeFrom(ByteString byteString) throws InvalidProtocolBufferException;

        Builder mergeFrom(ByteString byteString, H h10) throws InvalidProtocolBufferException;

        Builder mergeFrom(MessageLite messageLite);

        Builder mergeFrom(AbstractC2549t abstractC2549t) throws IOException;

        Builder mergeFrom(AbstractC2549t abstractC2549t, H h10) throws IOException;

        Builder mergeFrom(InputStream inputStream) throws IOException;

        Builder mergeFrom(InputStream inputStream, H h10) throws IOException;

        Builder mergeFrom(byte[] bArr) throws InvalidProtocolBufferException;

        Builder mergeFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException;

        Builder mergeFrom(byte[] bArr, int i10, int i11, H h10) throws InvalidProtocolBufferException;

        Builder mergeFrom(byte[] bArr, H h10) throws InvalidProtocolBufferException;
    }

    void a(OutputStream outputStream) throws IOException;

    void c(CodedOutputStream codedOutputStream) throws IOException;

    Builder e();

    ByteString f();

    int g();

    Builder i();

    InterfaceC2560y0<? extends MessageLite> k();

    byte[] toByteArray();

    void writeTo(OutputStream outputStream) throws IOException;
}
