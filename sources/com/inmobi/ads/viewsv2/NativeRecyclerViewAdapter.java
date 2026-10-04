package com.inmobi.ads.viewsv2;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.inmobi.media.C3708r7;
import com.inmobi.media.C3820z7;
import com.inmobi.media.N7;
import com.inmobi.media.S7;
import com.inmobi.media.W7;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class NativeRecyclerViewAdapter extends RecyclerView.Adapter<S7> implements W7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3820z7 f151729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public N7 f151730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f151731c;

    public NativeRecyclerViewAdapter(@NotNull C3820z7 nativeDataModel, @NotNull N7 nativeLayoutInflater) {
        G.p(nativeDataModel, "nativeDataModel");
        G.p(nativeLayoutInflater, "nativeLayoutInflater");
        this.f151729a = nativeDataModel;
        this.f151730b = nativeLayoutInflater;
        this.f151731c = new SparseArray();
    }

    @Nullable
    public ViewGroup buildScrollableView(int i10, @NotNull ViewGroup parent, @NotNull C3708r7 pageContainerAsset) {
        N7 n72;
        G.p(parent, "parent");
        G.p(pageContainerAsset, "pageContainerAsset");
        N7 n73 = this.f151730b;
        ViewGroup viewGroupA = n73 != null ? n73.a(parent, pageContainerAsset) : null;
        if (viewGroupA != null && (n72 = this.f151730b) != null) {
            n72.b(viewGroupA, pageContainerAsset);
        }
        return viewGroupA;
    }

    @Override // com.inmobi.media.W7
    public void destroy() {
        C3820z7 c3820z7 = this.f151729a;
        if (c3820z7 != null) {
            c3820z7.f153683m = null;
            c3820z7.f153678h = null;
        }
        this.f151729a = null;
        this.f151730b = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        C3820z7 c3820z7 = this.f151729a;
        if (c3820z7 != null) {
            return c3820z7.d();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull S7 holder, int i10) {
        View viewBuildScrollableView;
        G.p(holder, "holder");
        C3820z7 c3820z7 = this.f151729a;
        C3708r7 c3708r7B = c3820z7 != null ? c3820z7.b(i10) : null;
        WeakReference weakReference = (WeakReference) this.f151731c.get(i10);
        if (c3708r7B != null) {
            if (weakReference == null || (viewBuildScrollableView = (View) weakReference.get()) == null) {
                viewBuildScrollableView = buildScrollableView(i10, holder.f152437a, c3708r7B);
            }
            if (viewBuildScrollableView != null) {
                if (i10 != getItemCount() - 1) {
                    holder.f152437a.setPadding(0, 0, 16, 0);
                }
                holder.f152437a.addView(viewBuildScrollableView);
                this.f151731c.put(i10, new WeakReference(viewBuildScrollableView));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public S7 onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        G.p(parent, "parent");
        return new S7(new FrameLayout(parent.getContext()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NotNull S7 holder) {
        G.p(holder, "holder");
        holder.f152437a.removeAllViews();
        super.onViewRecycled(holder);
    }
}
