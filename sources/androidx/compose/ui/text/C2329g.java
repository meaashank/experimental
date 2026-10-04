package androidx.compose.ui.text;

import androidx.compose.ui.text.font.AbstractC2325w;
import androidx.compose.ui.text.font.C2326x;
import androidx.compose.ui.text.font.InterfaceC2324v;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.text.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2329g implements InterfaceC2324v.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f104668b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static Map<AbstractC2325w.b, InterfaceC2324v.b> f104669c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final androidx.compose.ui.text.platform.y f104670d = new androidx.compose.ui.text.platform.y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AbstractC2325w.b f104671a;

    /* JADX INFO: renamed from: androidx.compose.ui.text.g$a */
    @kotlin.jvm.internal.V({"SMAP\nTextLayoutResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader$Companion\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,610:1\n26#2:611\n1#3:612\n*S KotlinDebug\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader$Companion\n*L\n290#1:611\n*E\n"})
    public static final class a {
        public a() {
        }

        @NotNull
        public final InterfaceC2324v.b a(@NotNull AbstractC2325w.b bVar) {
            synchronized (C2329g.f104670d) {
                a aVar = C2329g.f104668b;
                aVar.getClass();
                InterfaceC2324v.b bVar2 = (InterfaceC2324v.b) C2329g.f104669c.get(bVar);
                if (bVar2 != null) {
                    return bVar2;
                }
                C2329g c2329g = new C2329g(bVar);
                aVar.getClass();
                C2329g.f104669c.put(bVar, c2329g);
                return c2329g;
            }
        }

        @NotNull
        public final Map<AbstractC2325w.b, InterfaceC2324v.b> b() {
            return C2329g.f104669c;
        }

        @NotNull
        public final androidx.compose.ui.text.platform.y c() {
            return C2329g.f104670d;
        }

        public final void d(@NotNull Map<AbstractC2325w.b, InterfaceC2324v.b> map) {
            C2329g.f104669c = map;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ C2329g(AbstractC2325w.b bVar, C4969v c4969v) {
        this(bVar);
    }

    @Override // androidx.compose.ui.text.font.InterfaceC2324v.b
    @InterfaceC4982o(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @InterfaceC4852c0(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    @NotNull
    public Object a(@NotNull InterfaceC2324v interfaceC2324v) {
        return C2326x.a(this.f104671a, androidx.compose.ui.text.font.C.g(interfaceC2324v), interfaceC2324v.getWeight(), interfaceC2324v.b(), 0, 8, null).getValue();
    }

    public C2329g(AbstractC2325w.b bVar) {
        this.f104671a = bVar;
    }
}
