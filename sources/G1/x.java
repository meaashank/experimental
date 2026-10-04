package g1;

import android.annotation.TargetApi;
import android.widget.SearchView;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC2511d;

/* JADX INFO: loaded from: classes2.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:onQueryTextFocusChange", method = "setOnQueryTextFocusChangeListener", type = SearchView.class), @androidx.databinding.g(attribute = "android:onSearchClick", method = "setOnSearchClickListener", type = SearchView.class), @androidx.databinding.g(attribute = "android:onClose", method = "setOnCloseListener", type = SearchView.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class x {

    public class a implements SearchView.OnQueryTextListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f202223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f202224b;

        public a(d dVar, c cVar) {
            this.f202223a = dVar;
            this.f202224b = cVar;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String str) {
            c cVar = this.f202224b;
            if (cVar != null) {
                return cVar.onQueryTextChange(str);
            }
            return false;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String str) {
            d dVar = this.f202223a;
            if (dVar != null) {
                return dVar.onQueryTextSubmit(str);
            }
            return false;
        }
    }

    public class b implements SearchView.OnSuggestionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f202225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f202226b;

        public b(f fVar, e eVar) {
            this.f202225a = fVar;
            this.f202226b = eVar;
        }

        @Override // android.widget.SearchView.OnSuggestionListener
        public boolean onSuggestionClick(int i10) {
            e eVar = this.f202226b;
            if (eVar != null) {
                return eVar.onSuggestionClick(i10);
            }
            return false;
        }

        @Override // android.widget.SearchView.OnSuggestionListener
        public boolean onSuggestionSelect(int i10) {
            f fVar = this.f202225a;
            if (fVar != null) {
                return fVar.onSuggestionSelect(i10);
            }
            return false;
        }
    }

    @TargetApi(11)
    public interface c {
        boolean onQueryTextChange(String str);
    }

    @TargetApi(11)
    public interface d {
        boolean onQueryTextSubmit(String str);
    }

    @TargetApi(11)
    public interface e {
        boolean onSuggestionClick(int i10);
    }

    @TargetApi(11)
    public interface f {
        boolean onSuggestionSelect(int i10);
    }

    @InterfaceC2511d(requireAll = false, value = {"android:onQueryTextSubmit", "android:onQueryTextChange"})
    public static void a(SearchView searchView, d dVar, c cVar) {
        if (dVar == null && cVar == null) {
            searchView.setOnQueryTextListener(null);
        } else {
            searchView.setOnQueryTextListener(new a(dVar, cVar));
        }
    }

    @InterfaceC2511d(requireAll = false, value = {"android:onSuggestionSelect", "android:onSuggestionClick"})
    public static void b(SearchView searchView, f fVar, e eVar) {
        if (fVar == null && eVar == null) {
            searchView.setOnSuggestionListener(null);
        } else {
            searchView.setOnSuggestionListener(new b(fVar, eVar));
        }
    }
}
