package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import fd.InterfaceC4421d;
import java.util.Iterator;
import kotlin.sequences.InterfaceC5000m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
public final class S {

    public static final class a implements InterfaceC5000m<MenuItem> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Menu f111632a;

        public a(Menu menu) {
            this.f111632a = menu;
        }

        @Override // kotlin.sequences.InterfaceC5000m
        public Iterator<MenuItem> iterator() {
            return new b(this.f111632a);
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt$iterator$1\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n87#2:96\n1#3:97\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt$iterator$1\n*L\n78#1:96\n78#1:97\n*E\n"})
    public static final class b implements Iterator<MenuItem>, InterfaceC4421d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f111633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Menu f111634b;

        public b(Menu menu) {
            this.f111634b = menu;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MenuItem next() {
            Menu menu = this.f111634b;
            int i10 = this.f111633a;
            this.f111633a = i10 + 1;
            MenuItem item = menu.getItem(i10);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f111633a < this.f111634b.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            kotlin.L0 l02;
            Menu menu = this.f111634b;
            int i10 = this.f111633a - 1;
            this.f111633a = i10;
            MenuItem item = menu.getItem(i10);
            if (item != null) {
                menu.removeItem(item.getItemId());
                l02 = kotlin.L0.f217464a;
            } else {
                l02 = null;
            }
            if (l02 == null) {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    public static final boolean a(@NotNull Menu menu, @NotNull MenuItem menuItem) {
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (kotlin.jvm.internal.G.g(menu.getItem(i10), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void b(@NotNull Menu menu, @NotNull ed.l<? super MenuItem, kotlin.L0> lVar) {
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            lVar.invoke(menu.getItem(i10));
        }
    }

    public static final void c(@NotNull Menu menu, @NotNull ed.p<? super Integer, ? super MenuItem, kotlin.L0> pVar) {
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVar.invoke(Integer.valueOf(i10), menu.getItem(i10));
        }
    }

    @NotNull
    public static final MenuItem d(@NotNull Menu menu, int i10) {
        return menu.getItem(i10);
    }

    @NotNull
    public static final InterfaceC5000m<MenuItem> e(@NotNull Menu menu) {
        return new a(menu);
    }

    public static final int f(@NotNull Menu menu) {
        return menu.size();
    }

    public static final boolean g(@NotNull Menu menu) {
        return menu.size() == 0;
    }

    public static final boolean h(@NotNull Menu menu) {
        return menu.size() != 0;
    }

    @NotNull
    public static final Iterator<MenuItem> i(@NotNull Menu menu) {
        return new b(menu);
    }

    public static final void j(@NotNull Menu menu, @NotNull MenuItem menuItem) {
        menu.removeItem(menuItem.getItemId());
    }

    public static final void k(@NotNull Menu menu, int i10) {
        kotlin.L0 l02;
        MenuItem item = menu.getItem(i10);
        if (item != null) {
            menu.removeItem(item.getItemId());
            l02 = kotlin.L0.f217464a;
        } else {
            l02 = null;
        }
        if (l02 == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}
