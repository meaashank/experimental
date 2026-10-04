package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class a0 extends Fragment {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f113816l = 16711681;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f113817m = 16711682;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f113818n = 16711683;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f113819a = new Handler();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f113820b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdapterView.OnItemClickListener f113821c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ListAdapter f113822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ListView f113823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f113824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f113825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f113826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f113827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f113828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f113829k;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListView listView = a0.this.f113823e;
            listView.focusableViewAvailable(listView);
        }
    }

    public class b implements AdapterView.OnItemClickListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            a0.this.getClass();
        }
    }

    public final void l() {
        if (this.f113823e != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.f113823e = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(f113816l);
            this.f113825g = textView;
            if (textView == null) {
                this.f113824f = view.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.f113826h = view.findViewById(f113817m);
            this.f113827i = view.findViewById(f113818n);
            View viewFindViewById = view.findViewById(R.id.list);
            if (!(viewFindViewById instanceof ListView)) {
                if (viewFindViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) viewFindViewById;
            this.f113823e = listView;
            View view2 = this.f113824f;
            if (view2 != null) {
                listView.setEmptyView(view2);
            } else {
                CharSequence charSequence = this.f113828j;
                if (charSequence != null) {
                    this.f113825g.setText(charSequence);
                    this.f113823e.setEmptyView(this.f113825g);
                }
            }
        }
        this.f113829k = true;
        this.f113823e.setOnItemClickListener(this.f113821c);
        ListAdapter listAdapter = this.f113822d;
        if (listAdapter != null) {
            this.f113822d = null;
            t(listAdapter);
        } else if (this.f113826h != null) {
            v(false, false);
        }
        this.f113819a.post(this.f113820b);
    }

    @Nullable
    public ListAdapter m() {
        return this.f113822d;
    }

    @NonNull
    public ListView n() {
        l();
        return this.f113823e;
    }

    public long o() {
        l();
        return this.f113823e.getSelectedItemId();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Context contextRequireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(contextRequireContext);
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setId(f113817m);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(contextRequireContext, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(contextRequireContext);
        frameLayout2.setId(f113818n);
        TextView textView = new TextView(contextRequireContext);
        textView.setId(f113816l);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(contextRequireContext);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f113819a.removeCallbacks(this.f113820b);
        this.f113823e = null;
        this.f113829k = false;
        this.f113827i = null;
        this.f113826h = null;
        this.f113824f = null;
        this.f113825g = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        l();
    }

    public int p() {
        l();
        return this.f113823e.getSelectedItemPosition();
    }

    public void q(@NonNull ListView listView, @NonNull View view, int i10, long j10) {
    }

    @NonNull
    public final ListAdapter r() {
        ListAdapter listAdapterM = m();
        if (listAdapterM != null) {
            return listAdapterM;
        }
        throw new IllegalStateException("ListFragment " + this + " does not have a ListAdapter.");
    }

    public void s(@Nullable CharSequence charSequence) {
        l();
        TextView textView = this.f113825g;
        if (textView == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        textView.setText(charSequence);
        if (this.f113828j == null) {
            this.f113823e.setEmptyView(this.f113825g);
        }
        this.f113828j = charSequence;
    }

    public void t(@Nullable ListAdapter listAdapter) {
        boolean z10 = this.f113822d != null;
        this.f113822d = listAdapter;
        ListView listView = this.f113823e;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.f113829k || z10) {
                return;
            }
            v(true, requireView().getWindowToken() != null);
        }
    }

    public void u(boolean z10) {
        v(z10, true);
    }

    public final void v(boolean z10, boolean z11) {
        l();
        View view = this.f113826h;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.f113829k == z10) {
            return;
        }
        this.f113829k = z10;
        if (z10) {
            if (z11) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
                this.f113827i.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
            } else {
                view.clearAnimation();
                this.f113827i.clearAnimation();
            }
            this.f113826h.setVisibility(8);
            this.f113827i.setVisibility(0);
            return;
        }
        if (z11) {
            view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
            this.f113827i.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
        } else {
            view.clearAnimation();
            this.f113827i.clearAnimation();
        }
        this.f113826h.setVisibility(0);
        this.f113827i.setVisibility(8);
    }

    public void w(boolean z10) {
        v(z10, false);
    }

    public void x(int i10) {
        l();
        this.f113823e.setSelection(i10);
    }
}
