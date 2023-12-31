# راهنمایی‌ها

## عمومی

توضیحات دقیق درباره وراثت را می‌توانید در [Inheritance][inheritance-main] پیدا کنید.
تمام مفهوم وراثت به شدت به مفاهیم [بازنویسی][java-overriding] مربوط می‌شود.

## 1. توصیف یک مبارز.

- در جاوا، متد `toString()` در واقع در کلاس Object (که کلاس پدر تمام کلاس‌ها در جاوا است) وجود دارد.
  شما می‌توانید درباره آن [اینجا][object-class-java] بیشتر بخوانید.

- برای بازنویسی این متد در کلاس پیاده‌سازی خود، باید یک متد با همان نام یعنی `toString()` و همان نوع بازگشتی یعنی `String` داشته باشید.

## 2. ساختن مبارزان به طور پیش‌فرض غیرآسیب‌پذیر.

- در نظر داشته باشید که یک متد `isVulnerable()` در کلاس `Fighter` داشته باشید که آسیب‌پذیری مبارز را نشان می‌دهد، برای اینکه غیرآسیب‌پذیر باشد به طور پیش‌فرض `false` برگردانید.
- این می‌تواند توسط هر کلاس فرزندی (کلاسی که `Fighter` را extend می کنید) بر اساس نیازهای آن٬ بازنویسی شود.

- باز هم مفهوم [بازنویسی][java-overriding] مفید خواهد بود.

## 3. اجازه دادن به جادوگران برای آماده‌سازی جادو.

- آماده‌سازی جادو فقط توسط یک جادوگر انجام می‌شود. بنابراین، منطقی است که این ویژگی در داخل کلاس `Wizard` تعریف شود.

- متد `prepareSpell()` را در داخل کلاس `Wizard` ایجاد کنید.

- به یاد داشته باشید: کلاس والدین (در اینجا `Fighter`) به ویژگی‌های کلاس فرزند (برای مثال، `Wizard`) دسترسی ندارد.

## 4. جادوگران را آسیب‌پذیر کنید وقتی جادویی آماده نکرده‌اند

- متد `isVulnerable()` را در کلاس `Wizard` بازنویسی کنید تا جادوگران اگر جادویی آماده نکرده‌اند٬ آسیب‌پذیر شوند.

## 5. محاسبه امتیازات آسیب برای یک جادوگر

- از یک [عبارت شرطی][if-else] برای برگرداندن امتیازات آسیب استفاده کنید، با در نظر گرفتن مقدار فیلد آماد بورن برای جادو.

## 6. محاسبه امتیازات آسیب برای یک جنگجو

- از یک [عبارت شرطی][if-else] برای برگرداندن امتیازات آسیب استفاده کنید، با در نظر گرفتن آسیب‌پذیری هدف.

[inheritance-main]: https://www.geeksforgeeks.org/inheritance-in-java/
[object-class-java]: https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html
[java-overriding]: https://docs.oracle.com/javase/tutorial/java/IandI/override.html
[if-else]: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html
