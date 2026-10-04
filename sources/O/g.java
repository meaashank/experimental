package O;

import androidx.compose.ui.autofill.AutofillType;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.n0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import s.C5555a;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nAndroidAutofillType.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofillType.android.kt\nandroidx/compose/ui/autofill/AndroidAutofillType_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final HashMap<AutofillType, String> f65116a = n0.M(new Pair(AutofillType.EmailAddress, C5555a.f237756a), new Pair(AutofillType.Username, C5555a.f237758c), new Pair(AutofillType.Password, "password"), new Pair(AutofillType.NewUsername, C5555a.f237748E), new Pair(AutofillType.NewPassword, C5555a.f237749F), new Pair(AutofillType.PostalAddress, C5555a.f237761f), new Pair(AutofillType.PostalCode, C5555a.f237762g), new Pair(AutofillType.CreditCardNumber, C5555a.f237763h), new Pair(AutofillType.CreditCardSecurityCode, C5555a.f237764i), new Pair(AutofillType.CreditCardExpirationDate, C5555a.f237765j), new Pair(AutofillType.CreditCardExpirationMonth, C5555a.f237766k), new Pair(AutofillType.CreditCardExpirationYear, C5555a.f237767l), new Pair(AutofillType.CreditCardExpirationDay, C5555a.f237768m), new Pair(AutofillType.AddressCountry, C5555a.f237769n), new Pair(AutofillType.AddressRegion, C5555a.f237770o), new Pair(AutofillType.AddressLocality, C5555a.f237771p), new Pair(AutofillType.AddressStreet, C5555a.f237772q), new Pair(AutofillType.AddressAuxiliaryDetails, C5555a.f237773r), new Pair(AutofillType.PostalCodeExtended, C5555a.f237774s), new Pair(AutofillType.PersonFullName, C5555a.f237775t), new Pair(AutofillType.PersonFirstName, C5555a.f237776u), new Pair(AutofillType.PersonLastName, C5555a.f237777v), new Pair(AutofillType.PersonMiddleName, C5555a.f237778w), new Pair(AutofillType.PersonMiddleInitial, C5555a.f237779x), new Pair(AutofillType.PersonNamePrefix, C5555a.f237780y), new Pair(AutofillType.PersonNameSuffix, C5555a.f237781z), new Pair(AutofillType.PhoneNumber, C5555a.f237744A), new Pair(AutofillType.PhoneNumberDevice, C5555a.f237745B), new Pair(AutofillType.PhoneCountryCode, C5555a.f237746C), new Pair(AutofillType.PhoneNumberNational, C5555a.f237747D), new Pair(AutofillType.Gender, C5555a.f237750G), new Pair(AutofillType.BirthDateFull, C5555a.f237751H), new Pair(AutofillType.BirthDateDay, C5555a.f237752I), new Pair(AutofillType.BirthDateMonth, C5555a.f237753J), new Pair(AutofillType.BirthDateYear, C5555a.f237754K), new Pair(AutofillType.SmsOtpCode, C5555a.f237755L));

    @NotNull
    public static final String b(@NotNull AutofillType autofillType) {
        String str = f65116a.get(autofillType);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type");
    }

    @androidx.compose.ui.i
    public static /* synthetic */ void a() {
    }

    @androidx.compose.ui.i
    public static /* synthetic */ void c(AutofillType autofillType) {
    }
}
