package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.C2528i;
import androidx.datastore.preferences.protobuf.Empty;
import androidx.datastore.preferences.protobuf.FieldSet;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder;
import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected X0 unknownFields = X0.f112772g;
    protected int memoizedSerializedSize = -1;

    public static abstract class Builder<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite.Builder<MessageType, BuilderType> {
        private final MessageType defaultInstance;
        protected MessageType instance;
        protected boolean isBuilt = false;

        public Builder(MessageType messagetype) {
            this.defaultInstance = messagetype;
            this.instance = (MessageType) messagetype.z(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        private void mergeFromInstance(MessageType messagetype, MessageType messagetype2) {
            A0.a().j(messagetype).a(messagetype, messagetype2);
        }

        public void copyOnWrite() {
            if (this.isBuilt) {
                MessageType messagetype = (MessageType) this.instance.z(MethodToInvoke.NEW_MUTABLE_INSTANCE);
                mergeFromInstance(messagetype, this.instance);
                this.instance = messagetype;
                this.isBuilt = false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2535l0
        public final boolean isInitialized() {
            return GeneratedMessageLite.N(this.instance, false);
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public final MessageType build() {
            MessageType messagetype = (MessageType) buildPartial();
            messagetype.getClass();
            if (GeneratedMessageLite.N(messagetype, true)) {
                return messagetype;
            }
            throw AbstractMessageLite.Builder.newUninitializedMessageException(messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public MessageType buildPartial() {
            if (this.isBuilt) {
                return this.instance;
            }
            this.instance.O();
            this.isBuilt = true;
            return this.instance;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public final BuilderType clear() {
            this.instance = (MessageType) this.instance.z(MethodToInvoke.NEW_MUTABLE_INSTANCE);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2535l0
        public MessageType getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        public BuilderType internalMergeFrom(MessageType messagetype) {
            return (BuilderType) mergeFrom((GeneratedMessageLite) messagetype);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public BuilderType mo7clone() {
            Empty.Builder builder = (BuilderType) getDefaultInstanceForType().i();
            builder.mergeFrom(buildPartial());
            return builder;
        }

        public BuilderType mergeFrom(MessageType messagetype) {
            copyOnWrite();
            mergeFromInstance(this.instance, messagetype);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i10, int i11, H h10) throws InvalidProtocolBufferException {
            copyOnWrite();
            try {
                A0.a().j(this.instance).g(this.instance, bArr, i10, i10 + i11, new C2528i.b(h10));
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.q();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            return (BuilderType) mergeFrom(bArr, i10, i11, H.d());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(AbstractC2549t abstractC2549t, H h10) throws IOException {
            copyOnWrite();
            try {
                A0.a().j(this.instance).d(this.instance, C2551u.S(abstractC2549t), h10);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }
    }

    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<?> f112601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f112602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f112603c;

        public SerializedForm(MessageLite messageLite) {
            Class<?> cls = messageLite.getClass();
            this.f112601a = cls;
            this.f112602b = cls.getName();
            this.f112603c = messageLite.toByteArray();
        }

        public static SerializedForm a(MessageLite messageLite) {
            return new SerializedForm(messageLite);
        }

        @Deprecated
        public final Object d() throws ObjectStreamException {
            try {
                java.lang.reflect.Field declaredField = g().getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((MessageLite) declaredField.get(null)).i().mergeFrom(this.f112603c).buildPartial();
            } catch (InvalidProtocolBufferException e10) {
                throw new RuntimeException("Unable to understand proto buffer", e10);
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.f112602b, e11);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Unable to call parsePartialFrom", e12);
            } catch (NoSuchFieldException e13) {
                throw new RuntimeException("Unable to find defaultInstance in " + this.f112602b, e13);
            } catch (SecurityException e14) {
                throw new RuntimeException("Unable to call defaultInstance in " + this.f112602b, e14);
            }
        }

        public final Class<?> g() throws ClassNotFoundException {
            Class<?> cls = this.f112601a;
            return cls != null ? cls : Class.forName(this.f112602b);
        }

        public Object readResolve() throws ObjectStreamException {
            try {
                java.lang.reflect.Field declaredField = g().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((MessageLite) declaredField.get(null)).i().mergeFrom(this.f112603c).buildPartial();
            } catch (InvalidProtocolBufferException e10) {
                throw new RuntimeException("Unable to understand proto buffer", e10);
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.f112602b, e11);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Unable to call parsePartialFrom", e12);
            } catch (NoSuchFieldException unused) {
                return d();
            } catch (SecurityException e13) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.f112602b, e13);
            }
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112604a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f112604a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112604a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b<T extends GeneratedMessageLite<T, ?>> extends AbstractC2512a<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f112605b;

        public b(T t10) {
            this.f112605b = t10;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2560y0
        /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
        public T o(AbstractC2549t abstractC2549t, H h10) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.r0(this.f112605b, abstractC2549t, h10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2512a, androidx.datastore.preferences.protobuf.InterfaceC2560y0
        /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public T h(byte[] bArr, int i10, int i11, H h10) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.s0(this.f112605b, bArr, i10, i11, h10);
        }
    }

    public static abstract class c<MessageType extends d<MessageType, BuilderType>, BuilderType extends c<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements e<MessageType, BuilderType> {
        public c(MessageType messagetype) {
            super(messagetype);
        }

        private FieldSet<f> p() {
            FieldSet<f> fieldSet = ((d) this.instance).extensions;
            if (!fieldSet.f112591b) {
                return fieldSet;
            }
            FieldSet fieldSetK = fieldSet.clone();
            ((d) this.instance).extensions = fieldSetK;
            return fieldSetK;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.e
        public final <Type> Type b(F<MessageType, List<Type>> f10, int i10) {
            return (Type) ((d) this.instance).b(f10, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder
        public void copyOnWrite() {
            if (this.isBuilt) {
                super.copyOnWrite();
                MessageType messagetype = this.instance;
                ((d) messagetype).extensions = ((d) messagetype).extensions.clone();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.e
        public final <Type> Type d(F<MessageType, Type> f10) {
            return (Type) ((d) this.instance).d(f10);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.e
        public final <Type> boolean h(F<MessageType, Type> f10) {
            return ((d) this.instance).h(f10);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.e
        public final <Type> int j(F<MessageType, List<Type>> f10) {
            return ((d) this.instance).j(f10);
        }

        public final <Type> BuilderType l(F<MessageType, List<Type>> f10, Type type) {
            g<MessageType, ?> gVarT = GeneratedMessageLite.t(f10);
            t(gVarT);
            copyOnWrite();
            p().h(gVarT.f112618d, gVarT.j(type));
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final MessageType buildPartial() {
            if (this.isBuilt) {
                return (MessageType) this.instance;
            }
            ((d) this.instance).extensions.I();
            return (MessageType) super.buildPartial();
        }

        public final <Type> BuilderType n(F<MessageType, ?> f10) {
            g<MessageType, ?> gVarT = GeneratedMessageLite.t(f10);
            t(gVarT);
            copyOnWrite();
            p().j(gVarT.f112618d);
            return this;
        }

        public void q(FieldSet<f> fieldSet) {
            copyOnWrite();
            ((d) this.instance).extensions = fieldSet;
        }

        public final <Type> BuilderType r(F<MessageType, List<Type>> f10, int i10, Type type) {
            g<MessageType, ?> gVarT = GeneratedMessageLite.t(f10);
            t(gVarT);
            copyOnWrite();
            p().P(gVarT.f112618d, i10, gVarT.j(type));
            return this;
        }

        public final <Type> BuilderType s(F<MessageType, Type> f10, Type type) {
            g<MessageType, ?> gVarT = GeneratedMessageLite.t(f10);
            t(gVarT);
            copyOnWrite();
            p().O(gVarT.f112618d, gVarT.k(type));
            return this;
        }

        public final void t(g<MessageType, ?> gVar) {
            if (gVar.h() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }
    }

    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType extends c<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements e<MessageType, BuilderType> {
        protected FieldSet<f> extensions = FieldSet.s();

        public class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator<Map.Entry<f, Object>> f112606a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Map.Entry<f, Object> f112607b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f112608c;

            public /* synthetic */ a(d dVar, boolean z10, a aVar) {
                this(z10);
            }

            public void a(int i10, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<f, Object> entry = this.f112607b;
                    if (entry == null || entry.getKey().f112611b >= i10) {
                        return;
                    }
                    f key = this.f112607b.getKey();
                    if (this.f112608c && key.f112612c.getJavaType() == WireFormat.JavaType.MESSAGE && !key.f112613d) {
                        codedOutputStream.P1(key.f112611b, (MessageLite) this.f112607b.getValue());
                    } else {
                        FieldSet.T(key, this.f112607b.getValue(), codedOutputStream);
                    }
                    if (this.f112606a.hasNext()) {
                        this.f112607b = this.f112606a.next();
                    } else {
                        this.f112607b = null;
                    }
                }
            }

            public a(boolean z10) {
                Iterator itH = d.this.extensions.H();
                this.f112606a = itH;
                if (itH.hasNext()) {
                    this.f112607b = (Map.Entry) itH.next();
                }
                this.f112608c = z10;
            }
        }

        private void K0(g<MessageType, ?> gVar) {
            if (gVar.h() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public int A0() {
            return this.extensions.z();
        }

        public int B0() {
            return this.extensions.v();
        }

        public final void C0(MessageType messagetype) {
            FieldSet<f> fieldSet = this.extensions;
            if (fieldSet.f112591b) {
                this.extensions = fieldSet.clone();
            }
            this.extensions.J(messagetype.extensions);
        }

        public final void D0(ByteString byteString, H h10, g<?, ?> gVar) throws IOException {
            MessageLite messageLite = (MessageLite) this.extensions.u(gVar.f112618d);
            MessageLite.Builder builderE = messageLite != null ? messageLite.e() : null;
            if (builderE == null) {
                builderE = gVar.c().i();
            }
            builderE.mergeFrom(byteString, h10);
            y0().O(gVar.f112618d, gVar.j(builderE.build()));
        }

        public final <MessageType extends MessageLite> void E0(MessageType messagetype, AbstractC2549t abstractC2549t, H h10) throws IOException {
            int iZ = 0;
            ByteString byteStringX = null;
            g<?, ?> gVarC = null;
            while (true) {
                int iY = abstractC2549t.Y();
                if (iY == 0) {
                    break;
                }
                if (iY == WireFormat.f112765s) {
                    iZ = abstractC2549t.Z();
                    if (iZ != 0) {
                        gVarC = h10.c(messagetype, iZ);
                    }
                } else if (iY == WireFormat.f112766t) {
                    if (iZ == 0 || gVarC == null) {
                        byteStringX = abstractC2549t.x();
                    } else {
                        x0(abstractC2549t, gVarC, h10, iZ);
                        byteStringX = null;
                    }
                } else if (!abstractC2549t.g0(iY)) {
                    break;
                }
            }
            abstractC2549t.a(WireFormat.f112764r);
            if (byteStringX == null || iZ == 0) {
                return;
            }
            if (gVarC != null) {
                D0(byteStringX, h10, gVarC);
            } else {
                P(iZ, byteStringX);
            }
        }

        public d<MessageType, BuilderType>.a F0() {
            return new a(false);
        }

        public d<MessageType, BuilderType>.a G0() {
            return new a(true);
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean H0(androidx.datastore.preferences.protobuf.AbstractC2549t r7, androidx.datastore.preferences.protobuf.H r8, androidx.datastore.preferences.protobuf.GeneratedMessageLite.g<?, ?> r9, int r10, int r11) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 262
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.GeneratedMessageLite.d.H0(androidx.datastore.preferences.protobuf.t, androidx.datastore.preferences.protobuf.H, androidx.datastore.preferences.protobuf.GeneratedMessageLite$g, int, int):boolean");
        }

        public <MessageType extends MessageLite> boolean I0(MessageType messagetype, AbstractC2549t abstractC2549t, H h10, int i10) throws IOException {
            int i11 = i10 >>> 3;
            return H0(abstractC2549t, h10, h10.c(messagetype, i11), i10, i11);
        }

        public <MessageType extends MessageLite> boolean J0(MessageType messagetype, AbstractC2549t abstractC2549t, H h10, int i10) throws IOException {
            if (i10 != WireFormat.f112763q) {
                return (i10 & 7) == 2 ? I0(messagetype, abstractC2549t, h10, i10) : abstractC2549t.g0(i10);
            }
            E0(messagetype, abstractC2549t, h10);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.e
        public final <Type> Type b(F<MessageType, List<Type>> f10, int i10) {
            f10.getClass();
            g<MessageType, ?> gVar = (g) f10;
            K0(gVar);
            return (Type) gVar.i(this.extensions.x(gVar.f112618d, i10));
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.e
        public final <Type> Type d(F<MessageType, Type> f10) {
            f10.getClass();
            g<MessageType, ?> gVar = (g) f10;
            K0(gVar);
            Object objU = this.extensions.u(gVar.f112618d);
            return objU == null ? gVar.f112616b : (Type) gVar.g(objU);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLite
        public /* bridge */ /* synthetic */ MessageLite.Builder e() {
            return e();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.InterfaceC2535l0
        public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.e
        public final <Type> boolean h(F<MessageType, Type> f10) {
            f10.getClass();
            g<MessageType, ?> gVar = (g) f10;
            K0(gVar);
            return this.extensions.B(gVar.f112618d);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLite
        public /* bridge */ /* synthetic */ MessageLite.Builder i() {
            return i();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.e
        public final <Type> int j(F<MessageType, List<Type>> f10) {
            f10.getClass();
            g<MessageType, ?> gVar = (g) f10;
            K0(gVar);
            return this.extensions.y(gVar.f112618d);
        }

        public final void x0(AbstractC2549t abstractC2549t, g<?, ?> gVar, H h10, int i10) throws IOException {
            H0(abstractC2549t, h10, gVar, (i10 << 3) | 2, i10);
        }

        public FieldSet<f> y0() {
            FieldSet<f> fieldSet = this.extensions;
            if (fieldSet.f112591b) {
                this.extensions = fieldSet.clone();
            }
            return this.extensions;
        }

        public boolean z0() {
            return this.extensions.E();
        }
    }

    public interface e<MessageType extends d<MessageType, BuilderType>, BuilderType extends c<MessageType, BuilderType>> extends InterfaceC2535l0 {
        <Type> Type b(F<MessageType, List<Type>> f10, int i10);

        <Type> Type d(F<MessageType, Type> f10);

        <Type> boolean h(F<MessageType, Type> f10);

        <Type> int j(F<MessageType, List<Type>> f10);
    }

    public static final class f implements FieldSet.b<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final V.d<?> f112610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f112611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WireFormat.FieldType f112612c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f112613d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f112614e;

        public f(V.d<?> dVar, int i10, WireFormat.FieldType fieldType, boolean z10, boolean z11) {
            this.f112610a = dVar;
            this.f112611b = i10;
            this.f112612c = fieldType;
            this.f112613d = z10;
            this.f112614e = z11;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.b
        public V.d<?> H2() {
            return this.f112610a;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.b
        public WireFormat.FieldType T0() {
            return this.f112612c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.FieldSet.b
        public MessageLite.Builder U(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).mergeFrom((GeneratedMessageLite) messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.b
        public WireFormat.JavaType V1() {
            return this.f112612c.getJavaType();
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(f fVar) {
            return this.f112611b - fVar.f112611b;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.b
        public int getNumber() {
            return this.f112611b;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.b
        public boolean isPacked() {
            return this.f112614e;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.b
        public boolean m3() {
            return this.f112613d;
        }
    }

    public static class g<ContainingType extends MessageLite, Type> extends F<ContainingType, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContainingType f112615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Type f112616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MessageLite f112617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final f f112618d;

        public g(ContainingType containingtype, Type type, MessageLite messageLite, f fVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (fVar.f112612c == WireFormat.FieldType.MESSAGE && messageLite == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f112615a = containingtype;
            this.f112616b = type;
            this.f112617c = messageLite;
            this.f112618d = fVar;
        }

        @Override // androidx.datastore.preferences.protobuf.F
        public Type a() {
            return this.f112616b;
        }

        @Override // androidx.datastore.preferences.protobuf.F
        public WireFormat.FieldType b() {
            return this.f112618d.f112612c;
        }

        @Override // androidx.datastore.preferences.protobuf.F
        public MessageLite c() {
            return this.f112617c;
        }

        @Override // androidx.datastore.preferences.protobuf.F
        public int d() {
            return this.f112618d.f112611b;
        }

        @Override // androidx.datastore.preferences.protobuf.F
        public boolean f() {
            return this.f112618d.f112613d;
        }

        public Object g(Object obj) {
            f fVar = this.f112618d;
            if (!fVar.f112613d) {
                return i(obj);
            }
            if (fVar.f112612c.getJavaType() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(i(it.next()));
            }
            return arrayList;
        }

        public ContainingType h() {
            return this.f112615a;
        }

        public Object i(Object obj) {
            return this.f112618d.f112612c.getJavaType() == WireFormat.JavaType.ENUM ? this.f112618d.f112610a.a(((Integer) obj).intValue()) : obj;
        }

        public Object j(Object obj) {
            return this.f112618d.f112612c.getJavaType() == WireFormat.JavaType.ENUM ? Integer.valueOf(((V.c) obj).getNumber()) : obj;
        }

        public Object k(Object obj) {
            f fVar = this.f112618d;
            if (!fVar.f112613d) {
                return j(obj);
            }
            if (fVar.f112612c.getJavaType() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(j(it.next()));
            }
            return arrayList;
        }
    }

    public static V.a C() {
        return C2540o.i();
    }

    public static V.b D() {
        return C2555w.i();
    }

    public static V.f E() {
        return O.i();
    }

    public static V.g F() {
        return U.i();
    }

    public static V.i G() {
        return C2519d0.i();
    }

    public static <E> V.k<E> H() {
        return B0.g();
    }

    public static <T extends GeneratedMessageLite<?, ?>> T J(Class<T> cls) {
        T t10 = (T) defaultInstanceMap.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 != null) {
            return t10;
        }
        T t11 = (T) ((GeneratedMessageLite) a1.j(cls)).getDefaultInstanceForType();
        if (t11 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t11);
        return t11;
    }

    public static java.lang.reflect.Method L(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e10);
        }
    }

    public static Object M(java.lang.reflect.Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final <T extends GeneratedMessageLite<T, ?>> boolean N(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.z(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        A0 a0A = A0.a();
        a0A.getClass();
        boolean zB = a0A.i(t10.getClass()).b(t10);
        if (z10) {
            t10.A(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, zB ? t10 : null);
        }
        return zB;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.V$a] */
    public static V.a S(V.a aVar) {
        int size = aVar.size();
        return aVar.d2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.V$b] */
    public static V.b T(V.b bVar) {
        int size = bVar.size();
        return bVar.d2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.V$f] */
    public static V.f U(V.f fVar) {
        int size = fVar.size();
        return fVar.d2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.V$g] */
    public static V.g V(V.g gVar) {
        int size = gVar.size();
        return gVar.d2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.V$i] */
    public static V.i W(V.i iVar) {
        int size = iVar.size();
        return iVar.d2(size == 0 ? 10 : size * 2);
    }

    public static <E> V.k<E> X(V.k<E> kVar) {
        int size = kVar.size();
        return kVar.d2(size == 0 ? 10 : size * 2);
    }

    public static Object Z(MessageLite messageLite, String str, Object[] objArr) {
        return new E0(messageLite, str, objArr);
    }

    public static <ContainingType extends MessageLite, Type> g<ContainingType, Type> a0(ContainingType containingtype, MessageLite messageLite, V.d<?> dVar, int i10, WireFormat.FieldType fieldType, boolean z10, Class cls) {
        return new g<>(containingtype, Collections.EMPTY_LIST, messageLite, new f(dVar, i10, fieldType, true, z10), cls);
    }

    public static <ContainingType extends MessageLite, Type> g<ContainingType, Type> b0(ContainingType containingtype, Type type, MessageLite messageLite, V.d<?> dVar, int i10, WireFormat.FieldType fieldType, Class cls) {
        return new g<>(containingtype, type, messageLite, new f(dVar, i10, fieldType, false, false), cls);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T c0(T t10, InputStream inputStream) throws InvalidProtocolBufferException {
        T t11 = (T) o0(t10, inputStream, H.d());
        w(t11);
        return t11;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T d0(T t10, InputStream inputStream, H h10) throws InvalidProtocolBufferException {
        T t11 = (T) o0(t10, inputStream, h10);
        w(t11);
        return t11;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T e0(T t10, ByteString byteString) throws InvalidProtocolBufferException {
        T t11 = (T) f0(t10, byteString, H.d());
        w(t11);
        return t11;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T f0(T t10, ByteString byteString, H h10) throws InvalidProtocolBufferException {
        T t11 = (T) p0(t10, byteString, h10);
        w(t11);
        return t11;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T g0(T t10, AbstractC2549t abstractC2549t) throws InvalidProtocolBufferException {
        return (T) h0(t10, abstractC2549t, H.d());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T h0(T t10, AbstractC2549t abstractC2549t, H h10) throws InvalidProtocolBufferException {
        T t11 = (T) r0(t10, abstractC2549t, h10);
        w(t11);
        return t11;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T i0(T t10, InputStream inputStream) throws InvalidProtocolBufferException {
        T t11 = (T) r0(t10, AbstractC2549t.k(inputStream, 4096), H.d());
        w(t11);
        return t11;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T j0(T t10, InputStream inputStream, H h10) throws InvalidProtocolBufferException {
        T t11 = (T) r0(t10, AbstractC2549t.k(inputStream, 4096), h10);
        w(t11);
        return t11;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T k0(T t10, ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (T) l0(t10, byteBuffer, H.d());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T l0(T t10, ByteBuffer byteBuffer, H h10) throws InvalidProtocolBufferException {
        T t11 = (T) h0(t10, AbstractC2549t.o(byteBuffer, false), h10);
        w(t11);
        return t11;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T m0(T t10, byte[] bArr) throws InvalidProtocolBufferException {
        T t11 = (T) s0(t10, bArr, 0, bArr.length, H.d());
        w(t11);
        return t11;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T n0(T t10, byte[] bArr, H h10) throws InvalidProtocolBufferException {
        T t11 = (T) s0(t10, bArr, 0, bArr.length, h10);
        w(t11);
        return t11;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T o0(T t10, InputStream inputStream, H h10) throws InvalidProtocolBufferException {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            AbstractC2549t abstractC2549tK = AbstractC2549t.k(new AbstractMessageLite.Builder.a(inputStream, AbstractC2549t.O(i10, inputStream)), 4096);
            T t11 = (T) r0(t10, abstractC2549tK, h10);
            try {
                abstractC2549tK.a(0);
                return t11;
            } catch (InvalidProtocolBufferException e10) {
                throw e10.o(t11);
            }
        } catch (IOException e11) {
            throw new InvalidProtocolBufferException(e11.getMessage());
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T p0(T t10, ByteString byteString, H h10) throws InvalidProtocolBufferException {
        AbstractC2549t abstractC2549tL = byteString.L();
        T t11 = (T) r0(t10, abstractC2549tL, h10);
        try {
            abstractC2549tL.a(0);
            return t11;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.o(t11);
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T q0(T t10, AbstractC2549t abstractC2549t) throws InvalidProtocolBufferException {
        return (T) r0(t10, abstractC2549t, H.d());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T r0(T t10, AbstractC2549t abstractC2549t, H h10) throws InvalidProtocolBufferException {
        T t11 = (T) t10.z(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            G0 g0J = A0.a().j(t11);
            g0J.d(t11, C2551u.S(abstractC2549t), h10);
            g0J.e(t11);
            return t11;
        } catch (IOException e10) {
            if (e10.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e10.getCause());
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e10.getMessage());
            invalidProtocolBufferException.f112635a = t11;
            throw invalidProtocolBufferException;
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e11.getCause());
            }
            throw e11;
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T s0(T t10, byte[] bArr, int i10, int i11, H h10) throws InvalidProtocolBufferException {
        T t11 = (T) t10.z(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            G0 g0J = A0.a().j(t11);
            g0J.g(t11, bArr, i10, i10 + i11, new C2528i.b(h10));
            g0J.e(t11);
            if (t11.memoizedHashCode == 0) {
                return t11;
            }
            throw new RuntimeException();
        } catch (IOException e10) {
            if (e10.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e10.getCause());
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e10.getMessage());
            invalidProtocolBufferException.f112635a = t11;
            throw invalidProtocolBufferException;
        } catch (IndexOutOfBoundsException unused) {
            InvalidProtocolBufferException invalidProtocolBufferExceptionQ = InvalidProtocolBufferException.q();
            invalidProtocolBufferExceptionQ.f112635a = t11;
            throw invalidProtocolBufferExceptionQ;
        }
    }

    public static g t(F f10) {
        f10.getClass();
        return (g) f10;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T t0(T t10, byte[] bArr, H h10) throws InvalidProtocolBufferException {
        T t11 = (T) s0(t10, bArr, 0, bArr.length, h10);
        w(t11);
        return t11;
    }

    public static <MessageType extends d<MessageType, BuilderType>, BuilderType extends c<MessageType, BuilderType>, T> g<MessageType, T> v(F<MessageType, T> f10) {
        f10.getClass();
        return (g) f10;
    }

    public static <T extends GeneratedMessageLite<?, ?>> void v0(Class<T> cls, T t10) {
        defaultInstanceMap.put(cls, t10);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T w(T t10) throws InvalidProtocolBufferException {
        if (t10 == null || N(t10, true)) {
            return t10;
        }
        InvalidProtocolBufferException invalidProtocolBufferExceptionD = t10.r().d();
        invalidProtocolBufferExceptionD.f112635a = t10;
        throw invalidProtocolBufferExceptionD;
    }

    public Object A(MethodToInvoke methodToInvoke, Object obj) {
        return B(methodToInvoke, obj, null);
    }

    public abstract Object B(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    public final void I() {
        if (this.unknownFields == X0.f112772g) {
            this.unknownFields = new X0();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2535l0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) z(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    public void O() {
        A0 a0A = A0.a();
        a0A.getClass();
        a0A.i(getClass()).e(this);
    }

    public void P(int i10, ByteString byteString) {
        I();
        this.unknownFields.m(i10, byteString);
    }

    public final void Q(X0 x02) {
        this.unknownFields = X0.o(this.unknownFields, x02);
    }

    public void R(int i10, int i11) {
        I();
        this.unknownFields.n(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final BuilderType i() {
        return (BuilderType) z(MethodToInvoke.NEW_BUILDER);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public void c(CodedOutputStream codedOutputStream) throws IOException {
        A0 a0A = A0.a();
        a0A.getClass();
        a0A.i(getClass()).c(this, C2553v.T(codedOutputStream));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getDefaultInstanceForType().getClass().isInstance(obj)) {
            return false;
        }
        A0 a0A = A0.a();
        a0A.getClass();
        return a0A.i(getClass()).equals(this, (GeneratedMessageLite) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public int g() {
        if (this.memoizedSerializedSize == -1) {
            A0 a0A = A0.a();
            a0A.getClass();
            this.memoizedSerializedSize = a0A.i(getClass()).f(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        A0 a0A = A0.a();
        a0A.getClass();
        int iHashCode = a0A.i(getClass()).hashCode(this);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2535l0
    public final boolean isInitialized() {
        return N(this, true);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final InterfaceC2560y0<MessageType> k() {
        return (InterfaceC2560y0) z(MethodToInvoke.GET_PARSER);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    public int o() {
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    public void s(int i10) {
        this.memoizedSerializedSize = i10;
    }

    public String toString() {
        return C2537m0.e(this, super.toString());
    }

    public Object u() throws Exception {
        return z(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    public boolean u0(int i10, AbstractC2549t abstractC2549t) throws IOException {
        if ((i10 & 7) == 4) {
            return false;
        }
        I();
        return this.unknownFields.k(i10, abstractC2549t);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public final BuilderType e() {
        BuilderType buildertype = (BuilderType) z(MethodToInvoke.NEW_BUILDER);
        buildertype.mergeFrom(this);
        return buildertype;
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> BuilderType x() {
        return (BuilderType) z(MethodToInvoke.NEW_BUILDER);
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> BuilderType y(MessageType messagetype) {
        return (BuilderType) x().mergeFrom((GeneratedMessageLite) messagetype);
    }

    public Object z(MethodToInvoke methodToInvoke) {
        return B(methodToInvoke, null, null);
    }
}
