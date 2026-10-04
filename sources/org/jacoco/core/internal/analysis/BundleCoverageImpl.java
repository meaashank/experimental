package org.jacoco.core.internal.analysis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.jacoco.core.analysis.CoverageNodeImpl;
import org.jacoco.core.analysis.IBundleCoverage;
import org.jacoco.core.analysis.IClassCoverage;
import org.jacoco.core.analysis.ICoverageNode;
import org.jacoco.core.analysis.IPackageCoverage;
import org.jacoco.core.analysis.ISourceFileCoverage;

/* JADX INFO: loaded from: classes6.dex */
public class BundleCoverageImpl extends CoverageNodeImpl implements IBundleCoverage {
    private final Collection<IPackageCoverage> packages;

    public BundleCoverageImpl(String str, Collection<IPackageCoverage> collection) {
        super(ICoverageNode.ElementType.BUNDLE, str);
        this.packages = collection;
        increment(collection);
    }

    private static <T> void addByName(Map<String, Collection<T>> map, String str, T t10) {
        Collection<T> arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(str, arrayList);
        }
        arrayList.add(t10);
    }

    private static Collection<IPackageCoverage> groupByPackage(Collection<IClassCoverage> collection, Collection<ISourceFileCoverage> collection2) {
        HashMap map = new HashMap();
        for (IClassCoverage iClassCoverage : collection) {
            addByName(map, iClassCoverage.getPackageName(), iClassCoverage);
        }
        HashMap map2 = new HashMap();
        for (ISourceFileCoverage iSourceFileCoverage : collection2) {
            addByName(map2, iSourceFileCoverage.getPackageName(), iSourceFileCoverage);
        }
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(map.keySet());
        hashSet.addAll(map2.keySet());
        ArrayList arrayList = new ArrayList();
        for (String str : hashSet) {
            Collection collection3 = (Collection) map.get(str);
            if (collection3 == null) {
                collection3 = Collections.EMPTY_LIST;
            }
            Collection collection4 = (Collection) map2.get(str);
            if (collection4 == null) {
                collection4 = Collections.EMPTY_LIST;
            }
            arrayList.add(new PackageCoverageImpl(str, collection3, collection4));
        }
        return arrayList;
    }

    @Override // org.jacoco.core.analysis.IBundleCoverage
    public Collection<IPackageCoverage> getPackages() {
        return this.packages;
    }

    public BundleCoverageImpl(String str, Collection<IClassCoverage> collection, Collection<ISourceFileCoverage> collection2) {
        this(str, groupByPackage(collection, collection2));
    }
}
