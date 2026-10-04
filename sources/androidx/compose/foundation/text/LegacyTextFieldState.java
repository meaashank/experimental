package androidx.compose.foundation.text;

import androidx.compose.runtime.InterfaceC1906e1;
import androidx.compose.runtime.L0;
import androidx.compose.runtime.M1;
import androidx.compose.ui.focus.InterfaceC1999n;
import androidx.compose.ui.graphics.InterfaceC2105s2;
import androidx.compose.ui.graphics.K0;
import androidx.compose.ui.graphics.X;
import androidx.compose.ui.layout.InterfaceC2188x;
import androidx.compose.ui.platform.InterfaceC2285u1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Z;
import androidx.compose.ui.text.b0;
import androidx.compose.ui.text.font.AbstractC2325w;
import androidx.compose.ui.text.input.C2348q;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.d0;
import com.prism.gaia.helper.utils.l;
import k0.InterfaceC4814e;
import kotlin.collections.EmptyList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/LegacyTextFieldState\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1252:1\n149#2:1253\n81#3:1254\n107#3,2:1255\n81#3:1257\n107#3,2:1258\n81#3:1261\n107#3,2:1262\n81#3:1264\n107#3,2:1265\n81#3:1267\n107#3,2:1268\n81#3:1270\n107#3,2:1271\n81#3:1273\n107#3,2:1274\n81#3:1276\n107#3,2:1277\n81#3:1279\n107#3,2:1280\n81#3:1282\n107#3,2:1283\n1#4:1260\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/LegacyTextFieldState\n*L\n883#1:1253\n878#1:1254\n878#1:1255,2\n883#1:1257\n883#1:1258,2\n943#1:1261\n943#1:1262,2\n953#1:1264\n953#1:1265,2\n959#1:1267\n959#1:1268,2\n965#1:1270\n965#1:1271,2\n971#1:1273\n971#1:1274,2\n983#1:1276\n983#1:1277,2\n1015#1:1279\n1015#1:1280,2\n1016#1:1282\n1016#1:1283,2\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class LegacyTextFieldState {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f93317z = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public y f93318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC1906e1 f93319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final InterfaceC2285u1 f93320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final EditProcessor f93321d = new EditProcessor();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public d0 f93322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final L0 f93323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final L0 f93324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public InterfaceC2188x f93325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final L0<G> f93326i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public AnnotatedString f93327j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final L0 f93328k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final L0 f93329l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final L0 f93330m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final L0 f93331n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final L0 f93332o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f93333p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final L0 f93334q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final C1823l f93335r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public ed.l<? super TextFieldValue, kotlin.L0> f93336s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final ed.l<TextFieldValue, kotlin.L0> f93337t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final ed.l<C2348q, kotlin.L0> f93338u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final InterfaceC2105s2 f93339v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f93340w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final L0 f93341x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final L0 f93342y;

    public LegacyTextFieldState(@NotNull y yVar, @NotNull InterfaceC1906e1 interfaceC1906e1, @Nullable InterfaceC2285u1 interfaceC2285u1) {
        this.f93318a = yVar;
        this.f93319b = interfaceC1906e1;
        this.f93320c = interfaceC2285u1;
        Boolean bool = Boolean.FALSE;
        this.f93323f = M1.g(bool, null, 2, null);
        this.f93324g = M1.g(new k0.i(0), null, 2, null);
        this.f93326i = M1.g(null, null, 2, null);
        this.f93328k = M1.g(HandleState.None, null, 2, null);
        this.f93329l = M1.g(bool, null, 2, null);
        this.f93330m = M1.g(bool, null, 2, null);
        this.f93331n = M1.g(bool, null, 2, null);
        this.f93332o = M1.g(bool, null, 2, null);
        this.f93333p = true;
        this.f93334q = M1.g(Boolean.TRUE, null, 2, null);
        this.f93335r = new C1823l(interfaceC2285u1);
        this.f93336s = new ed.l<TextFieldValue, kotlin.L0>() { // from class: androidx.compose.foundation.text.LegacyTextFieldState$onValueChangeOriginal$1
            public final void e(@NotNull TextFieldValue textFieldValue) {
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(TextFieldValue textFieldValue) {
                return kotlin.L0.f217464a;
            }
        };
        this.f93337t = new ed.l<TextFieldValue, kotlin.L0>() { // from class: androidx.compose.foundation.text.LegacyTextFieldState$onValueChange$1
            {
                super(1);
            }

            public final void e(@NotNull TextFieldValue textFieldValue) {
                String str = textFieldValue.f104741a.f104196a;
                AnnotatedString annotatedString = this.f93344d.f93327j;
                if (!kotlin.jvm.internal.G.g(str, annotatedString != null ? annotatedString.f104196a : null)) {
                    this.f93344d.B(HandleState.None);
                }
                LegacyTextFieldState legacyTextFieldState = this.f93344d;
                Z.a aVar = Z.f104406b;
                aVar.getClass();
                legacyTextFieldState.J(Z.f104407c);
                LegacyTextFieldState legacyTextFieldState2 = this.f93344d;
                aVar.getClass();
                legacyTextFieldState2.A(Z.f104407c);
                this.f93344d.f93336s.invoke(textFieldValue);
                this.f93344d.f93319b.invalidate();
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(TextFieldValue textFieldValue) {
                e(textFieldValue);
                return kotlin.L0.f217464a;
            }
        };
        this.f93338u = new ed.l<C2348q, kotlin.L0>() { // from class: androidx.compose.foundation.text.LegacyTextFieldState$onImeActionPerformed$1
            {
                super(1);
            }

            public final void e(int i10) {
                this.f93343d.f93335r.d(i10);
            }

            @Override // ed.l
            public /* synthetic */ kotlin.L0 invoke(C2348q c2348q) {
                e(c2348q.f104829a);
                return kotlin.L0.f217464a;
            }
        };
        this.f93339v = new X();
        K0.f100733b.getClass();
        this.f93340w = K0.f100746o;
        Z.a aVar = Z.f104406b;
        aVar.getClass();
        this.f93341x = M1.g(new Z(Z.f104407c), null, 2, null);
        aVar.getClass();
        this.f93342y = M1.g(new Z(Z.f104407c), null, 2, null);
    }

    public final void A(long j10) {
        this.f93342y.setValue(Z.b(j10));
    }

    public final void B(@NotNull HandleState handleState) {
        this.f93328k.setValue(handleState);
    }

    public final void C(boolean z10) {
        this.f93323f.setValue(Boolean.valueOf(z10));
    }

    public final void D(boolean z10) {
        this.f93334q.setValue(Boolean.valueOf(z10));
    }

    public final void E(@Nullable d0 d0Var) {
        this.f93322e = d0Var;
    }

    public final void F(@Nullable InterfaceC2188x interfaceC2188x) {
        this.f93325h = interfaceC2188x;
    }

    public final void G(@Nullable G g10) {
        this.f93326i.setValue(g10);
        this.f93333p = false;
    }

    public final void H(float f10) {
        this.f93324g.setValue(new k0.i(f10));
    }

    public final void I(long j10) {
        this.f93340w = j10;
    }

    public final void J(long j10) {
        this.f93341x.setValue(Z.b(j10));
    }

    public final void K(boolean z10) {
        this.f93332o.setValue(Boolean.valueOf(z10));
    }

    public final void L(boolean z10) {
        this.f93329l.setValue(Boolean.valueOf(z10));
    }

    public final void M(boolean z10) {
        this.f93331n.setValue(Boolean.valueOf(z10));
    }

    public final void N(boolean z10) {
        this.f93330m.setValue(Boolean.valueOf(z10));
    }

    public final void O(@NotNull y yVar) {
        this.f93318a = yVar;
    }

    public final void P(@Nullable AnnotatedString annotatedString) {
        this.f93327j = annotatedString;
    }

    public final void Q(@NotNull AnnotatedString annotatedString, @NotNull AnnotatedString annotatedString2, @NotNull b0 b0Var, boolean z10, @NotNull InterfaceC4814e interfaceC4814e, @NotNull AbstractC2325w.b bVar, @NotNull ed.l<? super TextFieldValue, kotlin.L0> lVar, @NotNull C1825n c1825n, @NotNull InterfaceC1999n interfaceC1999n, long j10) {
        this.f93336s = lVar;
        this.f93340w = j10;
        C1823l c1823l = this.f93335r;
        c1823l.f94403b = c1825n;
        c1823l.f94404c = interfaceC1999n;
        this.f93327j = annotatedString;
        y yVarC = z.c(this.f93318a, annotatedString2, b0Var, interfaceC4814e, bVar, z10, 0, 0, 0, EmptyList.f217510a, l.b.f165171e, null);
        if (this.f93318a != yVarC) {
            this.f93333p = true;
        }
        this.f93318a = yVarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long c() {
        return ((Z) this.f93342y.getValue()).f104408a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final HandleState d() {
        return (HandleState) this.f93328k.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e() {
        return ((Boolean) this.f93323f.getValue()).booleanValue();
    }

    @NotNull
    public final InterfaceC2105s2 f() {
        return this.f93339v;
    }

    @Nullable
    public final d0 g() {
        return this.f93322e;
    }

    @Nullable
    public final InterfaceC2285u1 h() {
        return this.f93320c;
    }

    @Nullable
    public final InterfaceC2188x i() {
        InterfaceC2188x interfaceC2188x = this.f93325h;
        if (interfaceC2188x == null || !interfaceC2188x.H()) {
            return null;
        }
        return interfaceC2188x;
    }

    @Nullable
    public final G j() {
        return this.f93326i.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float k() {
        return ((k0.i) this.f93324g.getValue()).f214312a;
    }

    @NotNull
    public final ed.l<C2348q, kotlin.L0> l() {
        return this.f93338u;
    }

    @NotNull
    public final ed.l<TextFieldValue, kotlin.L0> m() {
        return this.f93337t;
    }

    @NotNull
    public final EditProcessor n() {
        return this.f93321d;
    }

    @NotNull
    public final InterfaceC1906e1 o() {
        return this.f93319b;
    }

    public final long p() {
        return this.f93340w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long q() {
        return ((Z) this.f93341x.getValue()).f104408a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean r() {
        return ((Boolean) this.f93332o.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean s() {
        return ((Boolean) this.f93329l.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean t() {
        return ((Boolean) this.f93331n.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean u() {
        return ((Boolean) this.f93330m.getValue()).booleanValue();
    }

    @NotNull
    public final y v() {
        return this.f93318a;
    }

    @Nullable
    public final AnnotatedString w() {
        return this.f93327j;
    }

    public final boolean x() {
        return (Z.h(q()) && Z.h(c())) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean y() {
        return ((Boolean) this.f93334q.getValue()).booleanValue();
    }

    public final boolean z() {
        return this.f93333p;
    }
}
