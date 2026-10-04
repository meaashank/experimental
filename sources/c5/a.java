package C5;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class a extends PagerAdapter {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<View> f17590h;

    public a(List<View> list) {
        this.f17590h = list;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        viewGroup.removeView(this.f17590h.get(i10));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f17590h.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i10) {
        viewGroup.addView(this.f17590h.get(i10), 0);
        return this.f17590h.get(i10);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
