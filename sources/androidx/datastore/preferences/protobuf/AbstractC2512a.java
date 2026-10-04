package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.MessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2512a<MessageType extends MessageLite> implements InterfaceC2560y0<MessageType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H f112794a = H.d();

    public final MessageType A(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        InvalidProtocolBufferException invalidProtocolBufferExceptionD = B(messagetype).d();
        invalidProtocolBufferExceptionD.f112635a = messagetype;
        throw invalidProtocolBufferExceptionD;
    }

    public final UninitializedMessageException B(MessageType messagetype) {
        return messagetype instanceof AbstractMessageLite ? ((AbstractMessageLite) messagetype).r() : new UninitializedMessageException(messagetype);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2560y0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public MessageType q(InputStream inputStream) throws InvalidProtocolBufferException {
        return (MessageType) p(inputStream, f112794a);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2560y0
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public MessageType p(InputStream inputStream, H h10) throws InvalidProtocolBufferException {
        MessageType messagetype = (MessageType) n(inputStream, h10);
        A(messagetype);
        return messagetype;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2560y0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public MessageType k(ByteString byteString) throws InvalidProtocolBufferException {
        return (MessageType) s(byteString, f112794a);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2560y0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public MessageType s(ByteString byteString, H h10) throws InvalidProtocolBufferException {
        MessageType messagetype = (MessageType) u(byteString, h10);
        A(messagetype);
        return messagetype;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2560y0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public MessageType z(AbstractC2549t abstractC2549t) throws InvalidProtocolBufferException {
        return (MessageType) g(abstractC2549t, f112794a);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2560y0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public MessageType g(AbstractC2549t abstractC2549t, H h10) throws InvalidProtocolBufferException {
        MessageType messagetypeO = o(abstractC2549t, h10);
        A(messagetypeO);
        return messagetypeO;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2560y0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public MessageType i(InputStream inputStream) throws InvalidProtocolBufferException {
        return (MessageType) r(inputStream, f112794a);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2560y0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public MessageType r(InputStream inputStream, H h10) throws InvalidProtocolBufferException {
        MessageType messagetype = (MessageType) v(inputStream, h10);
        A(messagetype);
        return messagetype;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2560y0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public MessageType m(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MessageType) y(byteBuffer, f112794a);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2560y0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public MessageType y(ByteBuffer byteBuffer, H h10) throws InvalidProtocolBufferException {
        AbstractC2549t abstractC2549tO = AbstractC2549t.o(byteBuffer, false);
        MessageType messagetypeO = o(abstractC2549tO, h10);
        try {
            abstractC2549tO.a(0);
            A(messagetypeO);
            return messagetypeO;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.o(messagetypeO);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2560y0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public MessageType a(byte[] bArr) throws InvalidProtocolBufferException {
        return (MessageType) b(bArr, f112794a);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2560y0
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public MessageType j(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
        return (MessageType) t(bArr, i10, i11, f112794a);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2560y0
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public MessageType t(byte[] bArr, int i10, int i11, H h10) throws InvalidProtocolBufferException {
        MessageType messagetype = (MessageType) h(bArr, i10, i11, h10);
        A(messagetype);
        return messagetype;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2560y0
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public MessageType b(byte[] bArr, H h10) throws InvalidProtocolBufferException {
        return (MessageType) t(bArr, 0, bArr.length, h10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2560y0
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public MessageType e(InputStream inputStream) throws InvalidProtocolBufferException {
        return (MessageType) n(inputStream, f112794a);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2560y0
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public MessageType n(InputStream inputStream, H h10) throws InvalidProtocolBufferException {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            return (MessageType) v(new AbstractMessageLite.Builder.a(inputStream, AbstractC2549t.O(i10, inputStream)), h10);
        } catch (IOException e10) {
            throw new InvalidProtocolBufferException(e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2560y0
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public MessageType l(ByteString byteString) throws InvalidProtocolBufferException {
        return (MessageType) u(byteString, f112794a);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2560y0
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public MessageType u(ByteString byteString, H h10) throws InvalidProtocolBufferException {
        AbstractC2549t abstractC2549tL = byteString.L();
        MessageType messagetypeO = o(abstractC2549tL, h10);
        try {
            abstractC2549tL.a(0);
            return messagetypeO;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.o(messagetypeO);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2560y0
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public MessageType f(AbstractC2549t abstractC2549t) throws InvalidProtocolBufferException {
        return o(abstractC2549t, f112794a);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2560y0
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public MessageType w(InputStream inputStream) throws InvalidProtocolBufferException {
        return (MessageType) v(inputStream, f112794a);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2560y0
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public MessageType v(InputStream inputStream, H h10) throws InvalidProtocolBufferException {
        AbstractC2549t abstractC2549tK = AbstractC2549t.k(inputStream, 4096);
        MessageType messagetypeO = o(abstractC2549tK, h10);
        try {
            abstractC2549tK.a(0);
            return messagetypeO;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.o(messagetypeO);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2560y0
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public MessageType d(byte[] bArr) throws InvalidProtocolBufferException {
        return (MessageType) h(bArr, 0, bArr.length, f112794a);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2560y0
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public MessageType x(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
        return (MessageType) h(bArr, i10, i11, f112794a);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2560y0
    /* JADX INFO: renamed from: Z */
    public MessageType h(byte[] bArr, int i10, int i11, H h10) throws InvalidProtocolBufferException {
        AbstractC2549t abstractC2549tR = AbstractC2549t.r(bArr, i10, i11, false);
        MessageType messagetypeO = o(abstractC2549tR, h10);
        try {
            abstractC2549tR.a(0);
            return messagetypeO;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.o(messagetypeO);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2560y0
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public MessageType c(byte[] bArr, H h10) throws InvalidProtocolBufferException {
        return (MessageType) h(bArr, 0, bArr.length, h10);
    }
}
