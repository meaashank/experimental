package Q3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.cookiegames.smartcookie.browser.E;
import com.cookiegames.smartcookie.p;
import com.cookiegames.smartcookie.view.SmartCookieView;
import java.util.ArrayList;
import kotlin.G;
import kotlin.I;
import kotlin.collections.J;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nTabsDrawerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabsDrawerView.kt\ncom/cookiegames/smartcookie/browser/tabs/TabsDrawerView\n+ 2 ContextExtensions.kt\ncom/cookiegames/smartcookie/extensions/ContextExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,161:1\n36#2:162\n1549#3:163\n1620#3,3:164\n*S KotlinDebug\n*F\n+ 1 TabsDrawerView.kt\ncom/cookiegames/smartcookie/browser/tabs/TabsDrawerView\n*L\n64#1:162\n145#1:163\n145#1:164,3\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class u extends LinearLayout implements E {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f65860g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final S3.b f65861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final k f65862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final RecyclerView f65863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final View f65864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final View f65865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final G f65866f;

    public static final class a extends m.i {
        public a() {
            super(51, 0);
        }

        @Override // androidx.recyclerview.widget.m.f
        public boolean A(RecyclerView recyclerView, RecyclerView.C viewHolder, RecyclerView.C target) {
            kotlin.jvm.internal.G.p(recyclerView, "recyclerView");
            kotlin.jvm.internal.G.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.G.p(target, "target");
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            kotlin.jvm.internal.G.n(adapter, "null cannot be cast to non-null type com.cookiegames.smartcookie.browser.tabs.TabsDrawerAdapter");
            ((k) adapter).h(viewHolder.getAdapterPosition(), target.getAdapterPosition());
            return true;
        }

        @Override // androidx.recyclerview.widget.m.f
        public void D(RecyclerView.C viewHolder, int i10) {
            kotlin.jvm.internal.G.p(viewHolder, "viewHolder");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @dd.k
    public u(@NotNull Context context, @Nullable AttributeSet attributeSet, @NotNull u4.e userPreferences) {
        this(context, attributeSet, 0, userPreferences, 4, null);
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(userPreferences, "userPreferences");
    }

    public static void k(u uVar, View view) {
        uVar.f65861a.k();
    }

    public static boolean o(u uVar, View view) {
        uVar.f65861a.k0();
        return true;
    }

    public static final void p(u uVar, View view) {
        uVar.f65861a.k();
    }

    public static final void q(u uVar, View view) {
        S3.b bVar = uVar.f65861a;
        bVar.p0(bVar.n0().C());
    }

    public static final void r(u uVar, View view) {
        uVar.f65861a.w();
    }

    public static final void s(u uVar, View view) {
        uVar.f65861a.D0();
    }

    public static final void t(u uVar, View view) {
        uVar.f65861a.l0();
    }

    private final void u() {
        k kVar = this.f65862b;
        ArrayList<SmartCookieView> arrayList = this.f65861a.n0().f140756m;
        ArrayList arrayList2 = new ArrayList(J.d0(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            SmartCookieView smartCookieView = arrayList.get(i10);
            i10++;
            arrayList2.add(e.a(smartCookieView));
        }
        kVar.k(arrayList2);
    }

    public static final androidx.recyclerview.widget.m w() {
        return new androidx.recyclerview.widget.m(new a());
    }

    public static final void x(u uVar) {
        uVar.f65863c.smoothScrollToPosition(uVar.f65862b.f65851f.size() - 1);
    }

    @Override // com.cookiegames.smartcookie.browser.E
    public void a(boolean z10) {
        this.f65865e.setEnabled(z10);
    }

    @Override // com.cookiegames.smartcookie.browser.E
    public void b(int i10) {
        u();
    }

    @Override // com.cookiegames.smartcookie.browser.E
    public void c() {
        u();
        this.f65863c.postDelayed(new Runnable() { // from class: Q3.t
            @Override // java.lang.Runnable
            public final void run() {
                u.x(this.f65859a);
            }
        }, 500L);
    }

    @Override // com.cookiegames.smartcookie.browser.E
    public void d(int i10) {
        u();
    }

    @Override // com.cookiegames.smartcookie.browser.E
    public void e() {
        this.f65862b.notifyDataSetChanged();
    }

    @Override // com.cookiegames.smartcookie.browser.E
    public void f(boolean z10) {
        this.f65864d.setEnabled(z10);
    }

    public final androidx.recyclerview.widget.m v() {
        return (androidx.recyclerview.widget.m) this.f65866f.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @dd.k
    public u(@NotNull Context context, @NotNull u4.e userPreferences) {
        this(context, null, 0, userPreferences, 6, null);
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(userPreferences, "userPreferences");
    }

    public /* synthetic */ u(Context context, AttributeSet attributeSet, int i10, u4.e eVar, int i11, C4969v c4969v) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10, eVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @dd.k
    public u(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, @NotNull u4.e userPreferences) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(userPreferences, "userPreferences");
        S3.b bVar = (S3.b) context;
        this.f65861a = bVar;
        k kVar = new k(bVar, userPreferences);
        this.f65862b = kVar;
        this.f65866f = I.a(new l());
        setOrientation(1);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        kotlin.jvm.internal.G.o(layoutInflaterFrom, "from(...)");
        layoutInflaterFrom.inflate(p.m.f145268o3, (ViewGroup) this, true);
        int i11 = p.j.f144703g0;
        View viewFindViewById = findViewById(i11);
        kotlin.jvm.internal.G.o(viewFindViewById, "findViewById(...)");
        this.f65864d = viewFindViewById;
        int i12 = p.j.f144928v0;
        View viewFindViewById2 = findViewById(i12);
        kotlin.jvm.internal.G.o(viewFindViewById2, "findViewById(...)");
        this.f65865e = viewFindViewById2;
        o4.o oVar = new o4.o();
        oVar.f116271l = false;
        oVar.f116424c = 200L;
        oVar.f116427f = 0L;
        oVar.f116425d = 200L;
        oVar.f116426e = 200L;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setReverseLayout(userPreferences.Q0());
        View viewFindViewById3 = findViewById(p.j.f144789lb);
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        recyclerView.setLayerType(0, null);
        recyclerView.setItemAnimator(oVar);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(kVar);
        recyclerView.setHasFixedSize(true);
        kotlin.jvm.internal.G.o(viewFindViewById3, "apply(...)");
        RecyclerView recyclerView2 = (RecyclerView) viewFindViewById3;
        this.f65863c = recyclerView2;
        if (userPreferences.Q0()) {
            recyclerView2.setPadding(recyclerView2.getPaddingLeft(), 0, recyclerView2.getPaddingRight(), userPreferences.v() * 10);
        } else {
            recyclerView2.setPadding(recyclerView2.getPaddingLeft(), userPreferences.v() * 10, recyclerView2.getPaddingRight(), recyclerView2.getPaddingBottom());
        }
        v().d(recyclerView2);
        findViewById(p.j.f144714gb).setOnClickListener(new View.OnClickListener() { // from class: Q3.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u.q(this.f65852a, view);
            }
        });
        int i13 = p.j.f144508S7;
        View viewFindViewById4 = findViewById(i13);
        viewFindViewById4.setOnClickListener(new View.OnClickListener() { // from class: Q3.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u.k(this.f65853a, view);
            }
        });
        viewFindViewById4.setOnLongClickListener(new View.OnLongClickListener() { // from class: Q3.o
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                u.o(this.f65854a, view);
                return true;
            }
        });
        findViewById(i11).setOnClickListener(new View.OnClickListener() { // from class: Q3.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u.r(this.f65855a, view);
            }
        });
        findViewById(i12).setOnClickListener(new View.OnClickListener() { // from class: Q3.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u.s(this.f65856a, view);
            }
        });
        int i14 = p.j.f144958x0;
        findViewById(i14).setOnClickListener(new View.OnClickListener() { // from class: Q3.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u.t(this.f65857a, view);
            }
        });
        if (userPreferences.l0()) {
            findViewById(i14).setVisibility(8);
            findViewById(i12).setVisibility(8);
            findViewById(i11).setVisibility(8);
            findViewById(i13).setVisibility(8);
            int i15 = p.j.f144494R7;
            findViewById(i15).setVisibility(0);
            findViewById(i15).setOnClickListener(new View.OnClickListener() { // from class: Q3.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    u.p(this.f65858a, view);
                }
            });
        }
    }
}
