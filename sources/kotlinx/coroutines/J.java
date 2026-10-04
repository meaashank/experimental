package kotlinx.coroutines;

import androidx.collection.C1550p;
import kotlin.InterfaceC4850b0;
import kotlin.coroutines.i;
import kotlin.jvm.internal.C4969v;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC4850b0
@IgnoreJRERequirement
public final class J extends kotlin.coroutines.a implements Z0<String> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f218740c = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f218741b;

    public static final class a implements i.c<J> {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public J(long j10) {
        super(f218740c);
        this.f218741b = j10;
    }

    public static J J2(J j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j11 = j10.f218741b;
        }
        j10.getClass();
        return new J(j11);
    }

    public final long F2() {
        return this.f218741b;
    }

    @NotNull
    public final J H2(long j10) {
        return new J(j10);
    }

    public final long R2() {
        return this.f218741b;
    }

    @Override // kotlinx.coroutines.Z0
    /* JADX INFO: renamed from: V2, reason: merged with bridge method [inline-methods] */
    public void u(@NotNull kotlin.coroutines.i iVar, @NotNull String str) {
        Thread.currentThread().setName(str);
    }

    @Override // kotlinx.coroutines.Z0
    @NotNull
    /* JADX INFO: renamed from: Z2, reason: merged with bridge method [inline-methods] */
    public String z2(@NotNull kotlin.coroutines.i iVar) {
        String str;
        K k10 = (K) iVar.get(K.f218768c);
        if (k10 == null || (str = k10.f218769b) == null) {
            str = "coroutine";
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        int iA4 = kotlin.text.M.a4(name, CoroutineContextKt.f218705a, 0, false, 6, null);
        if (iA4 < 0) {
            iA4 = name.length();
        }
        StringBuilder sb2 = new StringBuilder(com.bytedance.sdk.component.utils.a.a(str, iA4, 10));
        String strSubstring = name.substring(0, iA4);
        kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        sb2.append(CoroutineContextKt.f218705a);
        sb2.append(str);
        sb2.append(H3.b.f45548j);
        sb2.append(this.f218741b);
        String string = sb2.toString();
        kotlin.jvm.internal.G.o(string, "toString(...)");
        threadCurrentThread.setName(string);
        return name;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J) && this.f218741b == ((J) obj).f218741b;
    }

    public int hashCode() {
        return C1550p.a(this.f218741b);
    }

    @NotNull
    public String toString() {
        return "CoroutineId(" + this.f218741b + ')';
    }
}
