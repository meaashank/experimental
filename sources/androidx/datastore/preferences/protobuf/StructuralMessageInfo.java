package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class StructuralMessageInfo implements InterfaceC2531j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProtoSyntax f112699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f112700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f112701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FieldInfo[] f112702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MessageLite f112703e;

    public StructuralMessageInfo(ProtoSyntax protoSyntax, boolean z10, int[] iArr, FieldInfo[] fieldInfoArr, Object obj) {
        this.f112699a = protoSyntax;
        this.f112700b = z10;
        this.f112701c = iArr;
        this.f112702d = fieldInfoArr;
        V.e(obj, "defaultInstance");
        this.f112703e = (MessageLite) obj;
    }

    public static Builder d() {
        return new Builder();
    }

    public static Builder e(int i10) {
        return new Builder(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2531j0
    public boolean a() {
        return this.f112700b;
    }

    public int[] b() {
        return this.f112701c;
    }

    public FieldInfo[] c() {
        return this.f112702d;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2531j0
    public MessageLite getDefaultInstance() {
        return this.f112703e;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2531j0
    public ProtoSyntax getSyntax() {
        return this.f112699a;
    }

    public static final class Builder {
        private int[] checkInitialized;
        private Object defaultInstance;
        private final List<FieldInfo> fields;
        private boolean messageSetWireFormat;
        private ProtoSyntax syntax;
        private boolean wasBuilt;

        public Builder() {
            this.checkInitialized = null;
            this.fields = new ArrayList();
        }

        public StructuralMessageInfo build() {
            if (this.wasBuilt) {
                throw new IllegalStateException("Builder can only build once");
            }
            if (this.syntax == null) {
                throw new IllegalStateException("Must specify a proto syntax");
            }
            this.wasBuilt = true;
            Collections.sort(this.fields);
            return new StructuralMessageInfo(this.syntax, this.messageSetWireFormat, this.checkInitialized, (FieldInfo[]) this.fields.toArray(new FieldInfo[0]), this.defaultInstance);
        }

        public void withCheckInitialized(int[] iArr) {
            this.checkInitialized = iArr;
        }

        public void withDefaultInstance(Object obj) {
            this.defaultInstance = obj;
        }

        public void withField(FieldInfo fieldInfo) {
            if (this.wasBuilt) {
                throw new IllegalStateException("Builder can only build once");
            }
            this.fields.add(fieldInfo);
        }

        public void withMessageSetWireFormat(boolean z10) {
            this.messageSetWireFormat = z10;
        }

        public void withSyntax(ProtoSyntax protoSyntax) {
            V.e(protoSyntax, "syntax");
            this.syntax = protoSyntax;
        }

        public Builder(int i10) {
            this.checkInitialized = null;
            this.fields = new ArrayList(i10);
        }
    }
}
