package a5;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.prism.lib.pfs.file.PrivateFile;
import g6.C4455a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d extends AsyncTask<PrivateFile, Void, List<PrivateFile>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f84743b = i5.b.g(d.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f84744a;

    public class a implements Comparator<PrivateFile> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(PrivateFile privateFile, PrivateFile privateFile2) {
            return privateFile.getName().toLowerCase().compareTo(privateFile2.getName().toLowerCase());
        }
    }

    public interface b {
        void a(List<PrivateFile> list);
    }

    public d(b bVar) {
        this.f84744a = bVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public List<PrivateFile> doInBackground(PrivateFile... privateFileArr) {
        if (privateFileArr == null) {
            return new ArrayList(0);
        }
        List<PrivateFile> list = privateFileArr[0].list();
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (PrivateFile privateFile : list) {
            if (!TextUtils.isEmpty(privateFile.getName())) {
                if (privateFile.isDirectory()) {
                    arrayList.add(privateFile);
                } else if (N4.d.w(privateFile.getType())) {
                    arrayList.add(privateFile);
                }
            }
        }
        Collections.sort(arrayList, new a());
        return arrayList;
    }

    public final /* synthetic */ void c(List list) {
        this.f84744a.a(list);
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(final List<PrivateFile> list) {
        if (list != null) {
            C4455a.b().b().execute(new Runnable() { // from class: a5.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f84741a.c(list);
                }
            });
        }
    }
}
