package g1;

import android.widget.SeekBar;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC2511d;

/* JADX INFO: loaded from: classes2.dex */
@androidx.databinding.p({@androidx.databinding.o(attribute = "android:progress", type = SeekBar.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class y {

    public class a implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f202227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.databinding.n f202228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f202229c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f202230d;

        public a(b bVar, androidx.databinding.n nVar, c cVar, d dVar) {
            this.f202227a = bVar;
            this.f202228b = nVar;
            this.f202229c = cVar;
            this.f202230d = dVar;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            b bVar = this.f202227a;
            if (bVar != null) {
                bVar.onProgressChanged(seekBar, i10, z10);
            }
            androidx.databinding.n nVar = this.f202228b;
            if (nVar != null) {
                nVar.a();
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            c cVar = this.f202229c;
            if (cVar != null) {
                cVar.onStartTrackingTouch(seekBar);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            d dVar = this.f202230d;
            if (dVar != null) {
                dVar.onStopTrackingTouch(seekBar);
            }
        }
    }

    public interface b {
        void onProgressChanged(SeekBar seekBar, int i10, boolean z10);
    }

    public interface c {
        void onStartTrackingTouch(SeekBar seekBar);
    }

    public interface d {
        void onStopTrackingTouch(SeekBar seekBar);
    }

    @InterfaceC2511d(requireAll = false, value = {"android:onStartTrackingTouch", "android:onStopTrackingTouch", "android:onProgressChanged", "android:progressAttrChanged"})
    public static void a(SeekBar seekBar, c cVar, d dVar, b bVar, androidx.databinding.n nVar) {
        if (cVar == null && dVar == null && bVar == null && nVar == null) {
            seekBar.setOnSeekBarChangeListener(null);
        } else {
            seekBar.setOnSeekBarChangeListener(new a(bVar, nVar, cVar, dVar));
        }
    }

    @InterfaceC2511d({"android:progress"})
    public static void b(SeekBar seekBar, int i10) {
        if (i10 != seekBar.getProgress()) {
            seekBar.setProgress(i10);
        }
    }
}
