package o4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.r;
import androidx.recyclerview.widget.RecyclerView;
import com.cookiegames.smartcookie.p;
import java.util.List;
import kotlin.L0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nRecyclerViewStringAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecyclerViewStringAdapter.kt\ncom/cookiegames/smartcookie/list/RecyclerViewStringAdapter\n+ 2 ContextExtensions.kt\ncom/cookiegames/smartcookie/extensions/ContextExtensionsKt\n*L\n1#1,46:1\n36#2:47\n*S KotlinDebug\n*F\n+ 1 RecyclerViewStringAdapter.kt\ncom/cookiegames/smartcookie/list/RecyclerViewStringAdapter\n*L\n22#1:47\n*E\n"})
@r(parameters = 0)
public final class j<T> extends RecyclerView.Adapter<k> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f223282g = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<T> f223283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ed.l<T, String> f223284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ed.l<? super T, L0> f223285f;

    /* JADX WARN: Multi-variable type inference failed */
    public j(@NotNull List<? extends T> listItems, @NotNull ed.l<? super T, String> convertToString) {
        G.p(listItems, "listItems");
        G.p(convertToString, "convertToString");
        this.f223283d = listItems;
        this.f223284e = convertToString;
    }

    public static final void k(j jVar, Object obj, View view) {
        ed.l<? super T, L0> lVar = jVar.f223285f;
        if (lVar != null) {
            lVar.invoke(obj);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f223283d.size();
    }

    @Nullable
    public final ed.l<T, L0> i() {
        return this.f223285f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull k holder, int i10) {
        G.p(holder, "holder");
        final T t10 = this.f223283d.get(i10);
        holder.f223287b.setText(this.f223284e.invoke(t10));
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: o4.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.k(this.f223280a, t10, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public k onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        G.p(parent, "parent");
        Context context = parent.getContext();
        G.o(context, "getContext(...)");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        G.o(layoutInflaterFrom, "from(...)");
        View viewInflate = layoutInflaterFrom.inflate(p.m.f145253l3, parent, false);
        G.o(viewInflate, "inflate(...)");
        return new k(viewInflate);
    }

    public final void m(@Nullable ed.l<? super T, L0> lVar) {
        this.f223285f = lVar;
    }
}
