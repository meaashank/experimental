package com.cookiegames.smartcookie.browser.bookmarks;

import B0.C0920d;
import T3.a;
import W3.s;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C2646i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.cookiegames.smartcookie.browser.C;
import com.cookiegames.smartcookie.browser.DrawerSizeChoice;
import com.cookiegames.smartcookie.browser.InterfaceC3103a;
import com.cookiegames.smartcookie.browser.bookmarks.BookmarksDrawerView;
import com.cookiegames.smartcookie.di.K;
import com.cookiegames.smartcookie.dialog.LightningDialogBuilder;
import com.cookiegames.smartcookie.p;
import com.cookiegames.smartcookie.reading.activity.ReadingActivity;
import com.cookiegames.smartcookie.view.SmartCookieView;
import e4.C4360c;
import hc.H;
import hc.O;
import io.reactivex.internal.functions.Functions;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import kotlin.G;
import kotlin.L0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.I;
import kotlin.collections.J;
import kotlin.collections.U;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.V;
import kotlin.text.M;
import nc.InterfaceC5271g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nBookmarksDrawerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BookmarksDrawerView.kt\ncom/cookiegames/smartcookie/browser/bookmarks/BookmarksDrawerView\n+ 2 ContextExtensions.kt\ncom/cookiegames/smartcookie/extensions/ContextExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,460:1\n36#2:461\n1549#3:462\n1620#3,3:463\n*S KotlinDebug\n*F\n+ 1 BookmarksDrawerView.kt\ncom/cookiegames/smartcookie/browser/bookmarks/BookmarksDrawerView\n*L\n111#1:461\n215#1:462\n215#1:463,3\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class BookmarksDrawerView extends LinearLayout implements InterfaceC3103a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f140940s = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Activity f140941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Inject
    public s f140942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Inject
    public com.cookiegames.smartcookie.adblock.allowlist.a f140943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Inject
    public LightningDialogBuilder f140944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Inject
    public C4360c f140945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Inject
    public H f140946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Inject
    public H f140947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Inject
    public H f140948h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final S3.b f140949i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public a f140950j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f140951k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public io.reactivex.disposables.b f140952l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public io.reactivex.disposables.b f140953m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.cookiegames.smartcookie.browser.bookmarks.a f140954n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public RecyclerView f140955o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public ImageView f140956p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public ImageView f140957q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final G f140958r;

    /* JADX INFO: renamed from: com.cookiegames.smartcookie.browser.bookmarks.BookmarksDrawerView$4, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements ed.l<T3.a, Boolean> {
        public AnonymousClass4(Object obj) {
            super(1, obj, BookmarksDrawerView.class, "handleItemLongPress", "handleItemLongPress(Lcom/cookiegames/smartcookie/database/Bookmark;)Z", 0);
        }

        public final Boolean e(T3.a p02) {
            kotlin.jvm.internal.G.p(p02, "p0");
            BookmarksDrawerView.s((BookmarksDrawerView) this.receiver, p02);
            return Boolean.TRUE;
        }

        @Override // ed.l
        public /* bridge */ /* synthetic */ Boolean invoke(T3.a aVar) {
            e(aVar);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.cookiegames.smartcookie.browser.bookmarks.BookmarksDrawerView$5, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements ed.l<T3.a, L0> {
        public AnonymousClass5(Object obj) {
            super(1, obj, BookmarksDrawerView.class, "handleItemClick", "handleItemClick(Lcom/cookiegames/smartcookie/database/Bookmark;)V", 0);
        }

        public final void e(T3.a p02) {
            kotlin.jvm.internal.G.p(p02, "p0");
            ((BookmarksDrawerView) this.receiver).C(p02);
        }

        @Override // ed.l
        public /* bridge */ /* synthetic */ L0 invoke(T3.a aVar) {
            e(aVar);
            return L0.f217464a;
        }
    }

    @V({"SMAP\nBookmarksDrawerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BookmarksDrawerView.kt\ncom/cookiegames/smartcookie/browser/bookmarks/BookmarksDrawerView$BookmarkListAdapter\n+ 2 ContextExtensions.kt\ncom/cookiegames/smartcookie/extensions/ContextExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,460:1\n41#2:461\n41#2:462\n1864#3,3:463\n1864#3,3:466\n*S KotlinDebug\n*F\n+ 1 BookmarksDrawerView.kt\ncom/cookiegames/smartcookie/browser/bookmarks/BookmarksDrawerView$BookmarkListAdapter\n*L\n336#1:461\n337#1:462\n357#1:463,3\n377#1:466,3\n*E\n"})
    public static final class a extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final C4360c f140959d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final H f140960e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final H f140961f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final ed.l<T3.a, Boolean> f140962g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public final ed.l<T3.a, L0> f140963h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final u4.e f140964i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final S3.b f140965j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final s f140966k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public final H f140967l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public List<r> f140968m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        public final ConcurrentHashMap<String, io.reactivex.disposables.b> f140969n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NotNull
        public final Drawable f140970o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NotNull
        public final Drawable f140971p;

        /* JADX INFO: renamed from: com.cookiegames.smartcookie.browser.bookmarks.BookmarksDrawerView$a$a, reason: collision with other inner class name */
        public static final class C0477a extends C2646i.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List<r> f140972a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f140973b;

            public C0477a(List<r> list, a aVar) {
                this.f140972a = list;
                this.f140973b = aVar;
            }

            @Override // androidx.recyclerview.widget.C2646i.b
            public boolean a(int i10, int i11) {
                return kotlin.jvm.internal.G.g(this.f140972a.get(i10), this.f140973b.f140968m.get(i11));
            }

            @Override // androidx.recyclerview.widget.C2646i.b
            public boolean b(int i10, int i11) {
                return kotlin.jvm.internal.G.g(this.f140972a.get(i10).f141011a.b(), this.f140973b.f140968m.get(i11).f141011a.b());
            }

            @Override // androidx.recyclerview.widget.C2646i.b
            public int d() {
                return this.f140973b.f140968m.size();
            }

            @Override // androidx.recyclerview.widget.C2646i.b
            public int e() {
                return this.f140972a.size();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Context context, @NotNull C4360c faviconModel, @NotNull H networkScheduler, @NotNull H mainScheduler, @NotNull ed.l<? super T3.a, Boolean> onItemLongClickListener, @NotNull ed.l<? super T3.a, L0> onItemClickListener, @NotNull u4.e userPreferences, @NotNull S3.b uiController, @NotNull s bookmarkManager, @NotNull H databaseScheduler) {
            kotlin.jvm.internal.G.p(context, "context");
            kotlin.jvm.internal.G.p(faviconModel, "faviconModel");
            kotlin.jvm.internal.G.p(networkScheduler, "networkScheduler");
            kotlin.jvm.internal.G.p(mainScheduler, "mainScheduler");
            kotlin.jvm.internal.G.p(onItemLongClickListener, "onItemLongClickListener");
            kotlin.jvm.internal.G.p(onItemClickListener, "onItemClickListener");
            kotlin.jvm.internal.G.p(userPreferences, "userPreferences");
            kotlin.jvm.internal.G.p(uiController, "uiController");
            kotlin.jvm.internal.G.p(bookmarkManager, "bookmarkManager");
            kotlin.jvm.internal.G.p(databaseScheduler, "databaseScheduler");
            this.f140959d = faviconModel;
            this.f140960e = networkScheduler;
            this.f140961f = mainScheduler;
            this.f140962g = onItemLongClickListener;
            this.f140963h = onItemClickListener;
            this.f140964i = userPreferences;
            this.f140965j = uiController;
            this.f140966k = bookmarkManager;
            this.f140967l = databaseScheduler;
            this.f140968m = EmptyList.f217510a;
            this.f140969n = new ConcurrentHashMap<>();
            Drawable drawable = C0920d.getDrawable(context, p.h.f144169q3);
            kotlin.jvm.internal.G.m(drawable);
            this.f140970o = drawable;
            Drawable drawable2 = C0920d.getDrawable(context, p.h.f144057d5);
            kotlin.jvm.internal.G.m(drawable2);
            this.f140971p = drawable2;
        }

        public static void h(ed.l lVar, Object obj) {
            lVar.invoke(obj);
        }

        public static /* synthetic */ void j() {
        }

        public static /* synthetic */ void l() {
        }

        public static final L0 r(a aVar, int i10, List list) {
            kotlin.jvm.internal.G.m(list);
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    I.b0();
                    throw null;
                }
                T3.a aVar2 = (T3.a) obj;
                s sVar = aVar.f140966k;
                kotlin.jvm.internal.G.n(aVar2, "null cannot be cast to non-null type com.cookiegames.smartcookie.database.Bookmark.Entry");
                sVar.u((a.C0110a) aVar2, i11 + i10).G0(aVar.f140967l).k0(aVar.f140961f).D0(new o());
                i11 = i12;
            }
            return L0.f217464a;
        }

        public static final void s() {
        }

        public static final void t(ed.l lVar, Object obj) {
            lVar.invoke(obj);
        }

        public static final void v() {
        }

        public static final L0 x(r rVar, b bVar, String str, Bitmap bitmap) {
            rVar.f141012b = bitmap;
            if (kotlin.jvm.internal.G.g(bVar.f140979g.getTag(), str)) {
                bVar.f140979g.setImageBitmap(bitmap);
            }
            return L0.f217464a;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f140968m.size();
        }

        public final void n() {
            for (io.reactivex.disposables.b bVar : this.f140969n.values()) {
                kotlin.jvm.internal.G.o(bVar, "next(...)");
                bVar.dispose();
            }
            this.f140969n.clear();
        }

        public final void o(@NotNull r item) {
            kotlin.jvm.internal.G.p(item, "item");
            z(U.v4(this.f140968m, item));
        }

        @NotNull
        public final r p(int i10) {
            return this.f140968m.get(i10);
        }

        public final void q(@NotNull String name, final int i10) {
            kotlin.jvm.internal.G.p(name, "name");
            hc.I<List<T3.a>> iE0 = this.f140966k.n(name).Z0(this.f140967l).E0(this.f140961f);
            final ed.l lVar = new ed.l() { // from class: com.cookiegames.smartcookie.browser.bookmarks.m
                @Override // ed.l
                public final Object invoke(Object obj) {
                    return BookmarksDrawerView.a.r(this.f140997a, i10, (List) obj);
                }
            };
            iE0.X0(new InterfaceC5271g() { // from class: com.cookiegames.smartcookie.browser.bookmarks.n
                @Override // nc.InterfaceC5271g
                public final void accept(Object obj) {
                    lVar.invoke(obj);
                }
            }, Functions.f202952f);
        }

        public final void u(int i10, int i11) {
            if (i10 < i11) {
                while (i10 < i11) {
                    int i12 = i10 + 1;
                    Collections.swap(this.f140968m, i10, i12);
                    i10 = i12;
                }
            } else {
                int i13 = i11 + 1;
                if (i13 <= i10) {
                    while (true) {
                        Collections.swap(this.f140968m, i10, i10 - 1);
                        if (i10 == i13) {
                            break;
                        } else {
                            i10--;
                        }
                    }
                }
            }
            int i14 = 0;
            for (Object obj : this.f140968m) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    I.b0();
                    throw null;
                }
                T3.a aVar = this.f140968m.get(i14).f141011a;
                if (aVar instanceof a.C0110a) {
                    s sVar = this.f140966k;
                    T3.a aVar2 = this.f140968m.get(i14).f141011a;
                    kotlin.jvm.internal.G.n(aVar2, "null cannot be cast to non-null type com.cookiegames.smartcookie.database.Bookmark.Entry");
                    sVar.u((a.C0110a) aVar2, i14).G0(this.f140967l).k0(this.f140961f).D0(new o());
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    q(this.f140968m.get(i14).f141011a.a(), i14);
                }
                i14 = i15;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull final b holder, int i10) {
            Drawable drawable;
            kotlin.jvm.internal.G.p(holder, "holder");
            holder.itemView.jumpDrawablesToCurrentState();
            final r rVar = this.f140968m.get(i10);
            holder.f140978f.setText(rVar.f141011a.a());
            final String strB = rVar.f141011a.b();
            holder.f140979g.setTag(strB);
            Bitmap bitmap = rVar.f141012b;
            if (bitmap != null) {
                holder.f140979g.setImageBitmap(bitmap);
                return;
            }
            T3.a aVar = rVar.f141011a;
            if (aVar instanceof a.b) {
                drawable = this.f140970o;
            } else {
                if (!(aVar instanceof a.C0110a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Drawable drawable2 = this.f140971p;
                io.reactivex.disposables.b bVar = this.f140969n.get(strB);
                if (bVar != null) {
                    bVar.dispose();
                }
                ConcurrentHashMap<String, io.reactivex.disposables.b> concurrentHashMap = this.f140969n;
                hc.q<Bitmap> qVarN0 = this.f140959d.g(strB, ((a.C0110a) rVar.f141011a).f68305h).p1(this.f140960e).N0(this.f140961f);
                kotlin.jvm.internal.G.o(qVarN0, "observeOn(...)");
                concurrentHashMap.put(strB, SubscribersKt.l(qVarN0, null, null, new ed.l() { // from class: com.cookiegames.smartcookie.browser.bookmarks.p
                    @Override // ed.l
                    public final Object invoke(Object obj) {
                        return BookmarksDrawerView.a.x(rVar, holder, strB, (Bitmap) obj);
                    }
                }, 3, null));
                drawable = drawable2;
            }
            holder.f140979g.setImageDrawable(drawable);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public b onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
            kotlin.jvm.internal.G.p(parent, "parent");
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(p.m.f145146O, parent, false);
            kotlin.jvm.internal.G.m(viewInflate);
            return new b(viewInflate, this, this.f140962g, this.f140963h, this.f140964i);
        }

        public final void z(@NotNull List<r> newList) {
            kotlin.jvm.internal.G.p(newList, "newList");
            List<r> list = this.f140968m;
            this.f140968m = newList;
            C2646i.c(new C0477a(list, this), true).e(this);
        }
    }

    public static final class b extends RecyclerView.C implements View.OnClickListener, View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final a f140974b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ed.l<T3.a, Boolean> f140975c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final ed.l<T3.a, L0> f140976d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final u4.e f140977e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final TextView f140978f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final ImageView f140979g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public final ImageButton f140980h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull View itemView, @NotNull a adapter, @NotNull ed.l<? super T3.a, Boolean> onItemLongClickListener, @NotNull ed.l<? super T3.a, L0> onItemClickListener, @NotNull u4.e userPreferences) {
            super(itemView);
            kotlin.jvm.internal.G.p(itemView, "itemView");
            kotlin.jvm.internal.G.p(adapter, "adapter");
            kotlin.jvm.internal.G.p(onItemLongClickListener, "onItemLongClickListener");
            kotlin.jvm.internal.G.p(onItemClickListener, "onItemClickListener");
            kotlin.jvm.internal.G.p(userPreferences, "userPreferences");
            this.f140974b = adapter;
            this.f140975c = onItemLongClickListener;
            this.f140976d = onItemClickListener;
            this.f140977e = userPreferences;
            View viewFindViewById = itemView.findViewById(p.j.f144302Db);
            kotlin.jvm.internal.G.o(viewFindViewById, "findViewById(...)");
            TextView textView = (TextView) viewFindViewById;
            this.f140978f = textView;
            View viewFindViewById2 = itemView.findViewById(p.j.f144932v4);
            kotlin.jvm.internal.G.o(viewFindViewById2, "findViewById(...)");
            this.f140979g = (ImageView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(p.j.f144294D3);
            kotlin.jvm.internal.G.o(viewFindViewById3, "findViewById(...)");
            ImageButton imageButton = (ImageButton) viewFindViewById3;
            this.f140980h = imageButton;
            imageButton.setOnClickListener(this);
            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);
            textView.setMaxLines(userPreferences.u().getValue() + 1);
            if (userPreferences.w() != DrawerSizeChoice.AUTO) {
                androidx.core.widget.q.r(textView, 0);
                textView.setTextSize(userPreferences.w().getValue() * 7);
            }
        }

        @NotNull
        public final ImageView c() {
            return this.f140979g;
        }

        @NotNull
        public final ImageButton d() {
            return this.f140980h;
        }

        @NotNull
        public final TextView e() {
            return this.f140978f;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View v10) {
            kotlin.jvm.internal.G.p(v10, "v");
            if (v10.equals(this.f140980h)) {
                int adapterPosition = getAdapterPosition();
                if (adapterPosition != -1) {
                    this.f140975c.invoke(this.f140974b.p(adapterPosition).f141011a);
                    return;
                }
                return;
            }
            int adapterPosition2 = getAdapterPosition();
            if (adapterPosition2 != -1) {
                this.f140976d.invoke(this.f140974b.p(adapterPosition2).f141011a);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(@NotNull View v10) {
            kotlin.jvm.internal.G.p(v10, "v");
            return true;
        }
    }

    public static final class c extends m.i {
        public c() {
            super(51, 0);
        }

        @Override // androidx.recyclerview.widget.m.f
        public boolean A(RecyclerView recyclerView, RecyclerView.C viewHolder, RecyclerView.C target) {
            kotlin.jvm.internal.G.p(recyclerView, "recyclerView");
            kotlin.jvm.internal.G.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.G.p(target, "target");
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            kotlin.jvm.internal.G.n(adapter, "null cannot be cast to non-null type com.cookiegames.smartcookie.browser.bookmarks.BookmarksDrawerView.BookmarkListAdapter");
            a aVar = (a) adapter;
            int adapterPosition = viewHolder.getAdapterPosition();
            int adapterPosition2 = target.getAdapterPosition();
            aVar.u(adapterPosition, adapterPosition2);
            aVar.notifyItemMoved(adapterPosition, adapterPosition2);
            return true;
        }

        @Override // androidx.recyclerview.widget.m.f
        public void D(RecyclerView.C viewHolder, int i10) {
            kotlin.jvm.internal.G.p(viewHolder, "viewHolder");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @dd.k
    public BookmarksDrawerView(@NotNull Context context, @NotNull Activity activity, @Nullable AttributeSet attributeSet, @NotNull u4.e userPreferences) {
        this(context, activity, attributeSet, 0, userPreferences, 8, null);
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(activity, "activity");
        kotlin.jvm.internal.G.p(userPreferences, "userPreferences");
    }

    public static final androidx.recyclerview.widget.m E() {
        return new androidx.recyclerview.widget.m(new c());
    }

    public static final List K(List it) {
        kotlin.jvm.internal.G.p(it, "it");
        return J.f0(it);
    }

    public static final List L(ed.l lVar, Object p02) {
        kotlin.jvm.internal.G.p(p02, "p0");
        return (List) lVar.invoke(p02);
    }

    public static final L0 M(BookmarksDrawerView bookmarksDrawerView, String str, boolean z10, List list) {
        bookmarksDrawerView.f140954n.f140982a = str;
        kotlin.jvm.internal.G.m(list);
        bookmarksDrawerView.G(list, z10);
        return L0.f217464a;
    }

    public static final void N(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final O O(String str, BookmarksDrawerView bookmarksDrawerView) {
        return str == null ? bookmarksDrawerView.u().s() : hc.I.o0(EmptyList.f217510a);
    }

    public static final L0 V(BookmarksDrawerView bookmarksDrawerView, String str, Boolean bool) {
        bookmarksDrawerView.f140953m = null;
        ImageView imageView = bookmarksDrawerView.f140957q;
        if (imageView != null) {
            kotlin.jvm.internal.G.m(bool);
            imageView.setSelected(bool.booleanValue());
        }
        ImageView imageView2 = bookmarksDrawerView.f140957q;
        if (imageView2 != null) {
            imageView2.setEnabled(!C4.s.d(str));
        }
        return L0.f217464a;
    }

    public static final void W(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static void l(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static void n(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void o(BookmarksDrawerView bookmarksDrawerView, View view) {
        RecyclerView.LayoutManager layoutManager;
        if (bookmarksDrawerView.f140954n.b()) {
            return;
        }
        bookmarksDrawerView.J(null, true);
        RecyclerView recyclerView = bookmarksDrawerView.f140955o;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        layoutManager.scrollToPosition(bookmarksDrawerView.f140951k);
    }

    public static final void p(BookmarksDrawerView bookmarksDrawerView, View view) {
        bookmarksDrawerView.f140949i.Z();
    }

    public static final void q(BookmarksDrawerView bookmarksDrawerView, Context context, View view) {
        SmartCookieView smartCookieView = bookmarksDrawerView.f140949i.n0().f140757n;
        if (smartCookieView != null) {
            ReadingActivity.f147679m.c(context, smartCookieView.H(), false);
        }
    }

    public static final /* synthetic */ boolean s(BookmarksDrawerView bookmarksDrawerView, T3.a aVar) {
        bookmarksDrawerView.D(aVar);
        return true;
    }

    @NotNull
    public final H A() {
        H h10 = this.f140947g;
        if (h10 != null) {
            return h10;
        }
        kotlin.jvm.internal.G.S("networkScheduler");
        throw null;
    }

    public final C B() {
        return this.f140949i.n0();
    }

    public final void C(T3.a aVar) {
        if (!(aVar instanceof a.b)) {
            if (!(aVar instanceof a.C0110a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f140949i.V((a.C0110a) aVar);
        } else {
            RecyclerView recyclerView = this.f140955o;
            RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
            kotlin.jvm.internal.G.n(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            this.f140951k = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
            J(((a.b) aVar).a(), true);
        }
    }

    public final boolean D(T3.a aVar) {
        Activity activity = (Activity) getContext();
        if (activity == null) {
            return true;
        }
        if (aVar instanceof a.b) {
            v().V(activity, this.f140949i, (a.b) aVar);
            return true;
        }
        if (!(aVar instanceof a.C0110a)) {
            throw new NoWhenBranchMatchedException();
        }
        v().q0(activity, this.f140949i, (a.C0110a) aVar);
        return true;
    }

    public final void F(@NotNull com.cookiegames.smartcookie.adblock.allowlist.a aVar) {
        kotlin.jvm.internal.G.p(aVar, "<set-?>");
        this.f140943c = aVar;
    }

    public final void G(List<? extends T3.a> list, boolean z10) {
        a aVar = this.f140950j;
        if (aVar != null) {
            List<? extends T3.a> list2 = list;
            ArrayList arrayList = new ArrayList(J.d0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new r((T3.a) it.next(), null, 2, null));
            }
            aVar.z(arrayList);
        }
        int i10 = this.f140954n.b() ? p.h.f144036b2 : p.h.f143898K1;
        if (z10) {
            ImageView imageView = this.f140956p;
            if (imageView != null) {
                imageView.startAnimation(N3.a.a(imageView, i10));
                return;
            }
            return;
        }
        ImageView imageView2 = this.f140956p;
        if (imageView2 != null) {
            imageView2.setImageResource(i10);
        }
    }

    public final void H(@NotNull s sVar) {
        kotlin.jvm.internal.G.p(sVar, "<set-?>");
        this.f140942b = sVar;
    }

    public final void I(@NotNull LightningDialogBuilder lightningDialogBuilder) {
        kotlin.jvm.internal.G.p(lightningDialogBuilder, "<set-?>");
        this.f140944d = lightningDialogBuilder;
    }

    public final void J(final String str, final boolean z10) {
        io.reactivex.disposables.b bVar = this.f140952l;
        if (bVar != null) {
            bVar.dispose();
        }
        hc.I iV7 = hc.I.m(u().n(str), hc.I.B(new Callable() { // from class: com.cookiegames.smartcookie.browser.bookmarks.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return BookmarksDrawerView.O(str, this);
            }
        })).v7();
        final j jVar = new j();
        hc.I iE0 = iV7.q0(new nc.o() { // from class: com.cookiegames.smartcookie.browser.bookmarks.k
            @Override // nc.o
            public final Object apply(Object obj) {
                return BookmarksDrawerView.L(jVar, obj);
            }
        }).Z0(w()).E0(z());
        final ed.l lVar = new ed.l() { // from class: com.cookiegames.smartcookie.browser.bookmarks.l
            @Override // ed.l
            public final Object invoke(Object obj) {
                return BookmarksDrawerView.M(this.f140994a, str, z10, (List) obj);
            }
        };
        this.f140952l = iE0.X0(new InterfaceC5271g() { // from class: com.cookiegames.smartcookie.browser.bookmarks.c
            @Override // nc.InterfaceC5271g
            public final void accept(Object obj) {
                BookmarksDrawerView.l(lVar, obj);
            }
        }, Functions.f202952f);
    }

    public final void P(@NotNull H h10) {
        kotlin.jvm.internal.G.p(h10, "<set-?>");
        this.f140946f = h10;
    }

    public final void Q(@NotNull C4360c c4360c) {
        kotlin.jvm.internal.G.p(c4360c, "<set-?>");
        this.f140945e = c4360c;
    }

    public final void R(@NotNull H h10) {
        kotlin.jvm.internal.G.p(h10, "<set-?>");
        this.f140948h = h10;
    }

    public final void S(@NotNull H h10) {
        kotlin.jvm.internal.G.p(h10, "<set-?>");
        this.f140947g = h10;
    }

    public final boolean T(@NotNull String inputStr, @NotNull String[] items) {
        kotlin.jvm.internal.G.p(inputStr, "inputStr");
        kotlin.jvm.internal.G.p(items, "items");
        for (String str : items) {
            if (M.p3(inputStr, str, false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    public final void U(final String str) {
        io.reactivex.disposables.b bVar = this.f140953m;
        if (bVar != null) {
            bVar.dispose();
        }
        hc.I<Boolean> iE0 = u().b(str).Z0(w()).E0(z());
        final ed.l lVar = new ed.l() { // from class: com.cookiegames.smartcookie.browser.bookmarks.b
            @Override // ed.l
            public final Object invoke(Object obj) {
                return BookmarksDrawerView.V(this.f140983a, str, (Boolean) obj);
            }
        };
        this.f140953m = iE0.X0(new InterfaceC5271g() { // from class: com.cookiegames.smartcookie.browser.bookmarks.d
            @Override // nc.InterfaceC5271g
            public final void accept(Object obj) {
                BookmarksDrawerView.n(lVar, obj);
            }
        }, Functions.f202952f);
    }

    @Override // com.cookiegames.smartcookie.browser.InterfaceC3103a
    public void a() {
        RecyclerView.LayoutManager layoutManager;
        if (this.f140954n.b()) {
            this.f140949i.w();
            return;
        }
        J(null, true);
        RecyclerView recyclerView = this.f140955o;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        layoutManager.scrollToPosition(this.f140951k);
    }

    @Override // com.cookiegames.smartcookie.browser.InterfaceC3103a
    public void b(@NotNull String url) {
        kotlin.jvm.internal.G.p(url, "url");
        U(url);
        J(this.f140954n.f140982a, false);
    }

    @Override // com.cookiegames.smartcookie.browser.InterfaceC3103a
    public void i(@NotNull T3.a bookmark) {
        kotlin.jvm.internal.G.p(bookmark, "bookmark");
        if (bookmark instanceof a.b) {
            J(null, false);
        } else {
            if (!(bookmark instanceof a.C0110a)) {
                throw new NoWhenBranchMatchedException();
            }
            a aVar = this.f140950j;
            if (aVar != null) {
                aVar.o(new r(bookmark, null, 2, null));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        io.reactivex.disposables.b bVar = this.f140952l;
        if (bVar != null) {
            bVar.dispose();
        }
        io.reactivex.disposables.b bVar2 = this.f140953m;
        if (bVar2 != null) {
            bVar2.dispose();
        }
        a aVar = this.f140950j;
        if (aVar != null) {
            aVar.n();
        }
    }

    @NotNull
    public final com.cookiegames.smartcookie.adblock.allowlist.a t() {
        com.cookiegames.smartcookie.adblock.allowlist.a aVar = this.f140943c;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.G.S("allowListModel");
        throw null;
    }

    @NotNull
    public final s u() {
        s sVar = this.f140942b;
        if (sVar != null) {
            return sVar;
        }
        kotlin.jvm.internal.G.S("bookmarkModel");
        throw null;
    }

    @NotNull
    public final LightningDialogBuilder v() {
        LightningDialogBuilder lightningDialogBuilder = this.f140944d;
        if (lightningDialogBuilder != null) {
            return lightningDialogBuilder;
        }
        kotlin.jvm.internal.G.S("bookmarksDialogBuilder");
        throw null;
    }

    @NotNull
    public final H w() {
        H h10 = this.f140946f;
        if (h10 != null) {
            return h10;
        }
        kotlin.jvm.internal.G.S("databaseScheduler");
        throw null;
    }

    @NotNull
    public final C4360c x() {
        C4360c c4360c = this.f140945e;
        if (c4360c != null) {
            return c4360c;
        }
        kotlin.jvm.internal.G.S("faviconModel");
        throw null;
    }

    public final androidx.recyclerview.widget.m y() {
        return (androidx.recyclerview.widget.m) this.f140958r.getValue();
    }

    @NotNull
    public final H z() {
        H h10 = this.f140948h;
        if (h10 != null) {
            return h10;
        }
        kotlin.jvm.internal.G.S("mainScheduler");
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @dd.k
    public BookmarksDrawerView(@NotNull Context context, @NotNull Activity activity, @NotNull u4.e userPreferences) {
        this(context, activity, null, 0, userPreferences, 12, null);
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(activity, "activity");
        kotlin.jvm.internal.G.p(userPreferences, "userPreferences");
    }

    public /* synthetic */ BookmarksDrawerView(Context context, Activity activity, AttributeSet attributeSet, int i10, u4.e eVar, int i11, C4969v c4969v) {
        this(context, activity, (i11 & 4) != 0 ? null : attributeSet, (i11 & 8) != 0 ? 0 : i10, eVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @dd.k
    public BookmarksDrawerView(@NotNull final Context context, @NotNull Activity activity, @Nullable AttributeSet attributeSet, int i10, @NotNull u4.e userPreferences) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(activity, "activity");
        kotlin.jvm.internal.G.p(userPreferences, "userPreferences");
        this.f140941a = activity;
        this.f140954n = new com.cookiegames.smartcookie.browser.bookmarks.a();
        this.f140958r = kotlin.I.a(new e());
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        kotlin.jvm.internal.G.o(layoutInflaterFrom, "from(...)");
        layoutInflaterFrom.inflate(p.m.f145142N, (ViewGroup) this, true);
        K.b(context).r(this);
        S3.b bVar = (S3.b) context;
        this.f140949i = bVar;
        this.f140955o = (RecyclerView) findViewById(p.j.f144899t1);
        this.f140956p = (ImageView) findViewById(p.j.f144869r1);
        this.f140957q = (ImageView) findViewById(p.j.f144673e0);
        ImageView imageView = this.f140956p;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.cookiegames.smartcookie.browser.bookmarks.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BookmarksDrawerView.o(this.f140987a, view);
                }
            });
        }
        ImageView imageView2 = this.f140957q;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.cookiegames.smartcookie.browser.bookmarks.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BookmarksDrawerView.p(this.f140988a, view);
                }
            });
        }
        findViewById(p.j.f144347H0).setOnClickListener(new View.OnClickListener() { // from class: com.cookiegames.smartcookie.browser.bookmarks.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BookmarksDrawerView.q(this.f140989a, context, view);
            }
        });
        this.f140950j = new a(context, x(), A(), z(), new AnonymousClass4(this), new AnonymousClass5(this), userPreferences, bVar, u(), w());
        y().d(this.f140955o);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setReverseLayout(userPreferences.Q0());
        RecyclerView recyclerView = this.f140955o;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(this.f140950j);
        }
        RecyclerView recyclerView2 = this.f140955o;
        if (recyclerView2 != null) {
            if (userPreferences.Q0()) {
                recyclerView2.setPadding(recyclerView2.getPaddingLeft(), 0, recyclerView2.getPaddingRight(), userPreferences.v() * 10);
            } else {
                recyclerView2.setPadding(recyclerView2.getPaddingLeft(), userPreferences.v() * 10, recyclerView2.getPaddingRight(), recyclerView2.getPaddingBottom());
            }
        }
        J(null, true);
    }
}
