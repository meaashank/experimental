package o4;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.r;
import androidx.recyclerview.widget.RecyclerView;
import c4.C2903j;
import com.cookiegames.smartcookie.p;
import java.util.List;
import kotlin.L0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nRecyclerViewDialogItemAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecyclerViewDialogItemAdapter.kt\ncom/cookiegames/smartcookie/list/RecyclerViewDialogItemAdapter\n+ 2 ContextExtensions.kt\ncom/cookiegames/smartcookie/extensions/ContextExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n36#2:56\n1#3:57\n*S KotlinDebug\n*F\n+ 1 RecyclerViewDialogItemAdapter.kt\ncom/cookiegames/smartcookie/list/RecyclerViewDialogItemAdapter\n*L\n24#1:56\n*E\n"})
@r(parameters = 0)
public final class h extends RecyclerView.Adapter<C5326a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f223277f = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<C2903j> f223278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public ed.l<? super C2903j, L0> f223279e;

    public h(@NotNull List<C2903j> listItems) {
        G.p(listItems, "listItems");
        this.f223278d = listItems;
    }

    public static final void k(h hVar, C2903j c2903j, View view) {
        ed.l<? super C2903j, L0> lVar = hVar.f223279e;
        if (lVar != null) {
            lVar.invoke(c2903j);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f223278d.size();
    }

    @Nullable
    public final ed.l<C2903j, L0> i() {
        return this.f223279e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C5326a holder, int i10) {
        G.p(holder, "holder");
        final C2903j c2903j = this.f223278d.get(i10);
        holder.f223225b.setImageDrawable(c2903j.f126151a);
        Integer num = c2903j.f126152b;
        if (num != null) {
            holder.f223225b.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
        holder.f223226c.setText(c2903j.f126153c);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: o4.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.k(this.f223275a, c2903j, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C5326a onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        G.p(parent, "parent");
        Context context = parent.getContext();
        G.o(context, "getContext(...)");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        G.o(layoutInflaterFrom, "from(...)");
        View viewInflate = layoutInflaterFrom.inflate(p.m.f145260n0, parent, false);
        G.o(viewInflate, "inflate(...)");
        return new C5326a(viewInflate);
    }

    public final void m(@Nullable ed.l<? super C2903j, L0> lVar) {
        this.f223279e = lVar;
    }
}
