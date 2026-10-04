package X;

import P.j;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.actionmodecallback.MenuItemOption;
import e.f0;
import ed.InterfaceC4376a;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nTextActionModeCallback.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextActionModeCallback.android.kt\nandroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
@r(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f76686g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final InterfaceC4376a<L0> f76687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public j f76688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public InterfaceC4376a<L0> f76689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public InterfaceC4376a<L0> f76690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public InterfaceC4376a<L0> f76691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public InterfaceC4376a<L0> f76692f;

    public c() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final void a(@NotNull Menu menu, @NotNull MenuItemOption menuItemOption) {
        menu.add(0, menuItemOption.getId(), menuItemOption.getOrder(), menuItemOption.getTitleResource()).setShowAsAction(1);
    }

    public final void b(Menu menu, MenuItemOption menuItemOption, InterfaceC4376a<L0> interfaceC4376a) {
        if (interfaceC4376a != null && menu.findItem(menuItemOption.getId()) == null) {
            a(menu, menuItemOption);
        } else {
            if (interfaceC4376a != null || menu.findItem(menuItemOption.getId()) == null) {
                return;
            }
            menu.removeItem(menuItemOption.getId());
        }
    }

    @Nullable
    public final InterfaceC4376a<L0> c() {
        return this.f76687a;
    }

    @Nullable
    public final InterfaceC4376a<L0> d() {
        return this.f76689c;
    }

    @Nullable
    public final InterfaceC4376a<L0> e() {
        return this.f76691e;
    }

    @Nullable
    public final InterfaceC4376a<L0> f() {
        return this.f76690d;
    }

    @Nullable
    public final InterfaceC4376a<L0> g() {
        return this.f76692f;
    }

    @NotNull
    public final j h() {
        return this.f76688b;
    }

    public final boolean i(@Nullable ActionMode actionMode, @Nullable MenuItem menuItem) {
        G.m(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            InterfaceC4376a<L0> interfaceC4376a = this.f76689c;
            if (interfaceC4376a != null) {
                interfaceC4376a.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            InterfaceC4376a<L0> interfaceC4376a2 = this.f76690d;
            if (interfaceC4376a2 != null) {
                interfaceC4376a2.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            InterfaceC4376a<L0> interfaceC4376a3 = this.f76691e;
            if (interfaceC4376a3 != null) {
                interfaceC4376a3.invoke();
            }
        } else {
            if (itemId != MenuItemOption.SelectAll.getId()) {
                return false;
            }
            InterfaceC4376a<L0> interfaceC4376a4 = this.f76692f;
            if (interfaceC4376a4 != null) {
                interfaceC4376a4.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final boolean j(@Nullable ActionMode actionMode, @Nullable Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (this.f76689c != null) {
            a(menu, MenuItemOption.Copy);
        }
        if (this.f76690d != null) {
            a(menu, MenuItemOption.Paste);
        }
        if (this.f76691e != null) {
            a(menu, MenuItemOption.Cut);
        }
        if (this.f76692f == null) {
            return true;
        }
        a(menu, MenuItemOption.SelectAll);
        return true;
    }

    public final void k() {
        InterfaceC4376a<L0> interfaceC4376a = this.f76687a;
        if (interfaceC4376a != null) {
            interfaceC4376a.invoke();
        }
    }

    public final boolean l(@Nullable ActionMode actionMode, @Nullable Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        r(menu);
        return true;
    }

    public final void m(@Nullable InterfaceC4376a<L0> interfaceC4376a) {
        this.f76689c = interfaceC4376a;
    }

    public final void n(@Nullable InterfaceC4376a<L0> interfaceC4376a) {
        this.f76691e = interfaceC4376a;
    }

    public final void o(@Nullable InterfaceC4376a<L0> interfaceC4376a) {
        this.f76690d = interfaceC4376a;
    }

    public final void p(@Nullable InterfaceC4376a<L0> interfaceC4376a) {
        this.f76692f = interfaceC4376a;
    }

    public final void q(@NotNull j jVar) {
        this.f76688b = jVar;
    }

    @f0
    public final void r(@NotNull Menu menu) {
        b(menu, MenuItemOption.Copy, this.f76689c);
        b(menu, MenuItemOption.Paste, this.f76690d);
        b(menu, MenuItemOption.Cut, this.f76691e);
        b(menu, MenuItemOption.SelectAll, this.f76692f);
    }

    public c(@Nullable InterfaceC4376a<L0> interfaceC4376a, @NotNull j jVar, @Nullable InterfaceC4376a<L0> interfaceC4376a2, @Nullable InterfaceC4376a<L0> interfaceC4376a3, @Nullable InterfaceC4376a<L0> interfaceC4376a4, @Nullable InterfaceC4376a<L0> interfaceC4376a5) {
        this.f76687a = interfaceC4376a;
        this.f76688b = jVar;
        this.f76689c = interfaceC4376a2;
        this.f76690d = interfaceC4376a3;
        this.f76691e = interfaceC4376a4;
        this.f76692f = interfaceC4376a5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(InterfaceC4376a interfaceC4376a, j jVar, InterfaceC4376a interfaceC4376a2, InterfaceC4376a interfaceC4376a3, InterfaceC4376a interfaceC4376a4, InterfaceC4376a interfaceC4376a5, int i10, C4969v c4969v) {
        interfaceC4376a = (i10 & 1) != 0 ? null : interfaceC4376a;
        if ((i10 & 2) != 0) {
            j.f65508e.getClass();
            jVar = j.f65510g;
        }
        this(interfaceC4376a, jVar, (i10 & 4) != 0 ? null : interfaceC4376a2, (i10 & 8) != 0 ? null : interfaceC4376a3, (i10 & 16) != 0 ? null : interfaceC4376a4, (i10 & 32) != 0 ? null : interfaceC4376a5);
    }
}
