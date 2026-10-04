package u;

import D0.i;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import t.C5594a;

/* JADX INFO: renamed from: u.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class C5631b extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<C5630a> f239284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f239285b;

    /* JADX INFO: renamed from: u.b$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f239286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f239287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ListenableFuture f239288c;

        public a(String str, c cVar, ListenableFuture listenableFuture) {
            this.f239286a = str;
            this.f239287b = cVar;
            this.f239288c = listenableFuture;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap;
            if (TextUtils.equals(this.f239286a, this.f239287b.f239292b.getText())) {
                try {
                    bitmap = (Bitmap) this.f239288c.get();
                } catch (InterruptedException | ExecutionException unused) {
                    bitmap = null;
                }
                if (bitmap != null) {
                    this.f239287b.f239291a.setVisibility(0);
                    this.f239287b.f239291a.setImageBitmap(bitmap);
                } else {
                    this.f239287b.f239291a.setVisibility(4);
                    this.f239287b.f239291a.setImageBitmap(null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: u.b$b, reason: collision with other inner class name */
    public class ExecutorC0889b implements Executor {
        public ExecutorC0889b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: u.b$c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f239291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f239292b;

        public c(ImageView imageView, TextView textView) {
            this.f239291a = imageView;
            this.f239292b = textView;
        }
    }

    public C5631b(List<C5630a> list, Context context) {
        this.f239284a = list;
        this.f239285b = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f239284a.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return this.f239284a.get(i10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        c cVar;
        C5630a c5630a = this.f239284a.get(i10);
        if (view == null) {
            view = LayoutInflater.from(this.f239285b).inflate(C5594a.d.f238635b, (ViewGroup) null);
            ImageView imageView = (ImageView) view.findViewById(C5594a.c.f238630b);
            TextView textView = (TextView) view.findViewById(C5594a.c.f238631c);
            if (imageView == null || textView == null) {
                throw new IllegalStateException("Browser Actions fallback UI does not contain necessary Views.");
            }
            cVar = new c(imageView, textView);
            view.setTag(cVar);
        } else {
            cVar = (c) view.getTag();
        }
        String strE = c5630a.e();
        cVar.f239292b.setText(strE);
        if (c5630a.b() != 0) {
            cVar.f239291a.setImageDrawable(i.g(this.f239285b.getResources(), c5630a.b(), null));
            return view;
        }
        if (c5630a.c() != null) {
            ListenableFuture<Bitmap> listenableFutureC = e.c(this.f239285b.getContentResolver(), c5630a.c());
            listenableFutureC.addListener(new a(strE, cVar, listenableFutureC), new ExecutorC0889b());
            return view;
        }
        cVar.f239291a.setImageBitmap(null);
        cVar.f239291a.setVisibility(4);
        return view;
    }
}
