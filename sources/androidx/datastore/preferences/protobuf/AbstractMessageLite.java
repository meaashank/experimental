package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.MessageLite;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractMessageLite<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite {
    protected int memoizedHashCode = 0;

    public static abstract class Builder<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite.Builder {
        @Deprecated
        public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            addAll((Iterable) iterable, (List) collection);
        }

        private static <T> void addAllCheckingNulls(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size = list.size();
            for (T t10 : iterable) {
                if (t10 == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t10);
            }
        }

        private String getReadingExceptionMessage(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        public static UninitializedMessageException newUninitializedMessageException(MessageLite messageLite) {
            return new UninitializedMessageException(messageLite);
        }

        @Override // 
        /* JADX INFO: renamed from: clone */
        public abstract BuilderType mo7clone();

        public abstract BuilderType internalMergeFrom(MessageType messagetype);

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public boolean mergeDelimitedFrom(InputStream inputStream, H h10) throws IOException {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return false;
            }
            mergeFrom((InputStream) new a(inputStream, AbstractC2549t.O(i10, inputStream)), h10);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public abstract BuilderType mergeFrom(AbstractC2549t abstractC2549t, H h10) throws IOException;

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(InputStream inputStream) throws IOException {
            AbstractC2549t abstractC2549tK = AbstractC2549t.k(inputStream, 4096);
            mergeFrom(abstractC2549tK);
            abstractC2549tK.a(0);
            return this;
        }

        public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
            V.d(iterable);
            if (!(iterable instanceof InterfaceC2513a0)) {
                if (iterable instanceof InterfaceC2562z0) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    addAllCheckingNulls(iterable, list);
                    return;
                }
            }
            List<?> listJ2 = ((InterfaceC2513a0) iterable).J2();
            InterfaceC2513a0 interfaceC2513a0 = (InterfaceC2513a0) list;
            int size = list.size();
            for (Object obj : listJ2) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC2513a0.size() - size) + " is null.";
                    for (int size2 = interfaceC2513a0.size() - 1; size2 >= size; size2--) {
                        interfaceC2513a0.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof ByteString) {
                    interfaceC2513a0.C1((ByteString) obj);
                } else {
                    interfaceC2513a0.add((String) obj);
                }
            }
        }

        public static final class a extends FilterInputStream {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f112500a;

            public a(InputStream inputStream, int i10) {
                super(inputStream);
                this.f112500a = i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f112500a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f112500a <= 0) {
                    return -1;
                }
                int i10 = super.read();
                if (i10 >= 0) {
                    this.f112500a--;
                }
                return i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j10) throws IOException {
                long jSkip = super.skip(Math.min(j10, this.f112500a));
                if (jSkip >= 0) {
                    this.f112500a = (int) (((long) this.f112500a) - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) throws IOException {
                int i12 = this.f112500a;
                if (i12 <= 0) {
                    return -1;
                }
                int i13 = super.read(bArr, i10, Math.min(i11, i12));
                if (i13 >= 0) {
                    this.f112500a -= i13;
                }
                return i13;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(InputStream inputStream, H h10) throws IOException {
            AbstractC2549t abstractC2549tK = AbstractC2549t.k(inputStream, 4096);
            mergeFrom(abstractC2549tK, h10);
            abstractC2549tK.a(0);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
            return mergeDelimitedFrom(inputStream, H.d());
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            try {
                AbstractC2549t abstractC2549tR = AbstractC2549t.r(bArr, i10, i11, false);
                mergeFrom(abstractC2549tR);
                abstractC2549tR.a(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i10, int i11, H h10) throws InvalidProtocolBufferException {
            try {
                AbstractC2549t abstractC2549tR = AbstractC2549t.r(bArr, i10, i11, false);
                mergeFrom(abstractC2549tR, h10);
                abstractC2549tR.a(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(AbstractC2549t abstractC2549t) throws IOException {
            return (BuilderType) mergeFrom(abstractC2549t, H.d());
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
            try {
                AbstractC2549t abstractC2549tL = byteString.L();
                mergeFrom(abstractC2549tL);
                abstractC2549tL.a(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(ByteString byteString, H h10) throws InvalidProtocolBufferException {
            try {
                AbstractC2549t abstractC2549tL = byteString.L();
                mergeFrom(abstractC2549tL, h10);
                abstractC2549tL.a(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BuilderType) mergeFrom(bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, H h10) throws InvalidProtocolBufferException {
            return (BuilderType) mergeFrom(bArr, 0, bArr.length, h10);
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(MessageLite messageLite) {
            if (getDefaultInstanceForType().getClass().isInstance(messageLite)) {
                return (BuilderType) internalMergeFrom((AbstractMessageLite) messageLite);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    public interface a {
        int getNumber();
    }

    @Deprecated
    public static <T> void l(Iterable<T> iterable, Collection<? super T> collection) {
        Builder.addAll((Iterable) iterable, (List) collection);
    }

    public static <T> void m(Iterable<T> iterable, List<? super T> list) {
        Builder.addAll((Iterable) iterable, (List) list);
    }

    public static void n(ByteString byteString) throws IllegalArgumentException {
        if (!byteString.I()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public void a(OutputStream outputStream) throws IOException {
        int iG = g();
        int iL0 = CodedOutputStream.L0(iG) + iG;
        if (iL0 > 4096) {
            iL0 = 4096;
        }
        CodedOutputStream.f fVar = new CodedOutputStream.f(outputStream, iL0);
        fVar.h2(iG);
        c(fVar);
        fVar.e1();
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public ByteString f() {
        try {
            ByteString.g gVarK = ByteString.K(g());
            c(gVarK.f112521a);
            return gVarK.a();
        } catch (IOException e10) {
            throw new RuntimeException(q("ByteString"), e10);
        }
    }

    public int o() {
        throw new UnsupportedOperationException();
    }

    public int p(G0 g02) {
        int iO = o();
        if (iO != -1) {
            return iO;
        }
        int iF = g02.f(this);
        s(iF);
        return iF;
    }

    public final String q(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public UninitializedMessageException r() {
        return new UninitializedMessageException(this);
    }

    public void s(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[g()];
            CodedOutputStream codedOutputStreamN1 = CodedOutputStream.n1(bArr);
            c(codedOutputStreamN1);
            codedOutputStreamN1.Z();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(q("byte array"), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public void writeTo(OutputStream outputStream) throws IOException {
        CodedOutputStream.f fVar = new CodedOutputStream.f(outputStream, CodedOutputStream.J0(g()));
        c(fVar);
        fVar.e1();
    }
}
