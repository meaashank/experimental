package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ConcatAdapter extends RecyclerView.Adapter<RecyclerView.C> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f116272e = "ConcatAdapter";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2644g f116273d;

    public static final class Config {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public static final Config f116274c = new Config(true, StableIdMode.NO_STABLE_IDS);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f116275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final StableIdMode f116276b;

        public static final class Builder {
            private boolean mIsolateViewTypes;
            private StableIdMode mStableIdMode;

            public Builder() {
                Config config = Config.f116274c;
                this.mIsolateViewTypes = config.f116275a;
                this.mStableIdMode = config.f116276b;
            }

            @NonNull
            public Config build() {
                return new Config(this.mIsolateViewTypes, this.mStableIdMode);
            }

            @NonNull
            public Builder setIsolateViewTypes(boolean z10) {
                this.mIsolateViewTypes = z10;
                return this;
            }

            @NonNull
            public Builder setStableIdMode(@NonNull StableIdMode stableIdMode) {
                this.mStableIdMode = stableIdMode;
                return this;
            }
        }

        public enum StableIdMode {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        public Config(boolean z10, @NonNull StableIdMode stableIdMode) {
            this.f116275a = z10;
            this.f116276b = stableIdMode;
        }
    }

    @SafeVarargs
    public ConcatAdapter(@NonNull RecyclerView.Adapter<? extends RecyclerView.C>... adapterArr) {
        this(Config.f116274c, adapterArr);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int findRelativeAdapterPositionIn(@NonNull RecyclerView.Adapter<? extends RecyclerView.C> adapter, @NonNull RecyclerView.C c10, int i10) {
        return this.f116273d.t(adapter, c10, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f116273d.u();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        return this.f116273d.r(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        return this.f116273d.s(i10);
    }

    public boolean h(int i10, @NonNull RecyclerView.Adapter<? extends RecyclerView.C> adapter) {
        return this.f116273d.h(i10, adapter);
    }

    public boolean i(@NonNull RecyclerView.Adapter<? extends RecyclerView.C> adapter) {
        return this.f116273d.i(adapter);
    }

    @NonNull
    public List<? extends RecyclerView.Adapter<? extends RecyclerView.C>> j() {
        return Collections.unmodifiableList(this.f116273d.q());
    }

    public void k(@NonNull RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        super.setStateRestorationPolicy(stateRestorationPolicy);
    }

    public boolean l(@NonNull RecyclerView.Adapter<? extends RecyclerView.C> adapter) {
        return this.f116273d.I(adapter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        this.f116273d.z(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.C c10, int i10) {
        this.f116273d.A(c10, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.C onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        return this.f116273d.B(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        this.f116273d.C(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(@NonNull RecyclerView.C c10) {
        return this.f116273d.D(c10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.C c10) {
        this.f116273d.E(c10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.C c10) {
        this.f116273d.F(c10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NonNull RecyclerView.C c10) {
        this.f116273d.G(c10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z10) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setStateRestorationPolicy(@NonNull RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    @SafeVarargs
    public ConcatAdapter(@NonNull Config config, @NonNull RecyclerView.Adapter<? extends RecyclerView.C>... adapterArr) {
        this(config, (List<? extends RecyclerView.Adapter<? extends RecyclerView.C>>) Arrays.asList(adapterArr));
    }

    public ConcatAdapter(@NonNull List<? extends RecyclerView.Adapter<? extends RecyclerView.C>> list) {
        this(Config.f116274c, list);
    }

    public ConcatAdapter(@NonNull Config config, @NonNull List<? extends RecyclerView.Adapter<? extends RecyclerView.C>> list) {
        this.f116273d = new C2644g(this, config);
        Iterator<? extends RecyclerView.Adapter<? extends RecyclerView.C>> it = list.iterator();
        while (it.hasNext()) {
            i(it.next());
        }
        super.setHasStableIds(this.f116273d.w());
    }
}
