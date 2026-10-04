package com.prism.hider.ad.ui;

import P9.a;
import Q9.c;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.prism.fusionadsdk.LjAdLoader;
import com.prism.fusionadsdk.LjAdRequest;

/* JADX INFO: loaded from: classes6.dex */
public class AdsContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f167754a = "AdsContainerView";

    public static class AdsFragment extends Fragment {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f167755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f167756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public FrameLayout f167757c;

        public class a extends T6.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ View f167758a;

            public a(View view) {
                this.f167758a = view;
            }

            @Override // T6.a
            public void f(Object obj) {
                ((J6.c) obj).c(AdsFragment.this.getActivity(), (ViewGroup) this.f167758a);
            }
        }

        public final View a(ViewGroup viewGroup) {
            View viewB = b(viewGroup);
            new LjAdLoader.Builder().withReportPrefix(a.b.f65586b).withAdListener(new a(viewB)).build().u(getActivity(), new LjAdRequest.Builder(getActivity()).setAdPlaceName(a.C0095a.f65579b).build());
            return viewB;
        }

        public View b(ViewGroup viewGroup) {
            return c.c(viewGroup);
        }

        public final void c() {
            if (this.f167757c == null || getActivity() == null) {
                return;
            }
            this.f167757c.removeAllViews();
            FrameLayout frameLayout = this.f167757c;
            frameLayout.addView(a(frameLayout));
        }

        @Override // android.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            this.f167756b = getActivity().getResources().getConfiguration().orientation;
        }

        @Override // android.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            this.f167757c = new FrameLayout(getActivity());
            String unused = AdsContainerView.f167754a;
            FrameLayout frameLayout = this.f167757c;
            frameLayout.addView(a(frameLayout));
            return this.f167757c;
        }

        @Override // android.app.Fragment
        public void onDestroy() {
            super.onDestroy();
        }

        @Override // android.app.Fragment
        public void onResume() {
            super.onResume();
            c cVar = this.f167755a;
            if (cVar == null || !cVar.d(this.f167756b)) {
                return;
            }
            c();
        }
    }

    public AdsContainerView(Context context) {
        super(context);
    }

    public void b(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(0, 0, 0, 0);
    }

    public AdsContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AdsContainerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
