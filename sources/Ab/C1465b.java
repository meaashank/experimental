package ab;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import com.prism.commons.file.FileType;
import com.prism.commons.utils.l0;
import com.prism.lib.media.ui.widget.photoview.AttachPhotoView;
import com.prism.lib.pfs.d;
import com.prism.lib.pfs.file.exchange.ExchangeFile;
import com.prism.lib.pfs.ui.pager.preview.PreviewFileView;
import com.prism.lib.pfs.ui.pager.preview.PreviewImageView;
import com.prism.lib.pfs.ui.pager.preview.PreviewItemView;
import com.prism.lib.pfs.ui.pager.preview.PreviewVideoView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import y6.InterfaceC5839b;
import z6.InterfaceC5860b;

/* JADX INFO: renamed from: ab.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C1465b extends PagerAdapter implements InterfaceC5839b<ExchangeFile> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f84814l = l0.b(C1465b.class.getSimpleName());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC5860b<ExchangeFile> f84815h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f84818k = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map<Integer, PreviewItemView> f84816i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<ExchangeFile> f84817j = new ArrayList<>();

    public C1465b(InterfaceC5860b<ExchangeFile> interfaceC5860b) {
        this.f84815h = interfaceC5860b;
    }

    public static void f(PreviewItemView previewItemView, boolean z10) {
        AttachPhotoView attachPhotoViewC;
        if ((previewItemView instanceof PreviewImageView) && (attachPhotoViewC = ((PreviewImageView) previewItemView).c()) != null) {
            attachPhotoViewC.d().h0(z10);
        }
    }

    @Override // y6.InterfaceC5839b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ExchangeFile a(int i10) {
        if (i10 < 0 || i10 >= this.f84817j.size()) {
            return null;
        }
        return this.f84817j.get(i10);
    }

    public PreviewItemView c(int i10) {
        return this.f84816i.get(Integer.valueOf(i10));
    }

    public int d(int i10) {
        if (i10 < 0) {
            return 0;
        }
        return i10 >= this.f84817j.size() ? this.f84817j.size() - 1 : i10;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NonNull ViewGroup viewGroup, int i10, @NonNull Object obj) {
        viewGroup.removeView((PreviewItemView) obj);
        this.f84816i.remove(Integer.valueOf(i10));
    }

    public void e(PreviewItemView previewItemView) {
        this.f84817j.remove(previewItemView.getItem());
        notifyDataSetChanged();
    }

    public void g(boolean z10) {
        this.f84818k = z10;
        Iterator<PreviewItemView> it = this.f84816i.values().iterator();
        while (it.hasNext()) {
            f(it.next(), z10);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f84817j.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(@NonNull Object obj) {
        PreviewItemView previewItemView = (PreviewItemView) obj;
        ExchangeFile exchangeFileA = a(previewItemView.e());
        if (exchangeFileA == null || !exchangeFileA.equals(previewItemView.getItem())) {
            return -2;
        }
        return previewItemView.e();
    }

    public void h(Collection<? extends ExchangeFile> collection) {
        this.f84817j = new ArrayList<>(collection);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @NonNull
    @SuppressLint({"InflateParams"})
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        ExchangeFile exchangeFileA = a(i10);
        FileType type = exchangeFileA.getType();
        PreviewItemView previewItemView = type == FileType.IMAGE ? (PreviewImageView) LayoutInflater.from(context).inflate(d.k.f187001n0, (ViewGroup) null, false) : (type == FileType.VIDEO || type == FileType.AUDIO) ? (PreviewVideoView) LayoutInflater.from(context).inflate(d.k.f187007p0, (ViewGroup) null, false) : (PreviewFileView) LayoutInflater.from(context).inflate(d.k.f186995l0, (ViewGroup) null, false);
        previewItemView.i(this.f84815h);
        previewItemView.b(this, i10, exchangeFileA);
        f(previewItemView, this.f84818k);
        viewGroup.addView(previewItemView);
        this.f84816i.put(Integer.valueOf(i10), previewItemView);
        return previewItemView;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return obj == view;
    }
}
