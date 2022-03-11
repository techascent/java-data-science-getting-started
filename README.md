# java-data-science-getting-started

A complete working example Java program that demonstrates using [tech.ml.dataset](https://github.com/techascent/tech.ml.dataset). Doing similar things in Java without this library would be much more onerous.

## Notes

This program uses [Maven](https://maven.apache.org/) to manage the dependencies of the [Java](https://www.java.com/) program. Both will need to be installed for this program to build and run.

This program is a companion to this blog post: [https://techascent.com/blog/java-data-science-getting-started.html](https://techascent.com/blog/java-data-science-getting-started.html)

## Usage

`$ ./scripts/run`

## Typical Output

```clojure
https://github.com/scicloj/metamorph-examples/raw/main/data/titanic/train.csv [10 12]:

| PassengerId | Survived | Pclass |                            Name |    Sex |  Age | SibSp | Parch |   Ticket |     Fare |   Cabin | Embarked |
|------------:|---------:|-------:|---------------------------------|--------|-----:|------:|------:|----------|---------:|---------|----------|
|         768 |        0 |      3 |              Mangan, Miss. Mary | female | 30.5 |     0 |     0 |   364850 |   7.7500 |         |        Q |
|         453 |        0 |      1 | Foreman, Mr. Benjamin Laventall |   male | 30.0 |     0 |     0 |   113051 |  27.7500 |    C111 |        C |
|         225 |        1 |      1 |    Hoyt, Mr. Frederick Maxfield |   male | 38.0 |     1 |     0 |    19943 |  90.0000 |     C93 |        S |
|          45 |        1 |      3 |   Devaney, Miss. Margaret Delia | female | 19.0 |     0 |     0 |   330958 |   7.8792 |         |        Q |
|         207 |        0 |      3 |      Backstrom, Mr. Karl Alfred |   male | 32.0 |     1 |     0 |  3101278 |  15.8500 |         |        S |
|         322 |        0 |      3 |                Danoff, Mr. Yoto |   male | 27.0 |     0 |     0 |   349219 |   7.8958 |         |        S |
|         791 |        0 |      3 |        Keane, Mr. Andrew "Andy" |   male |      |     0 |     0 |    12460 |   7.7500 |         |        Q |
|         169 |        0 |      1 |             Baumann, Mr. John D |   male |      |     0 |     0 | PC 17318 |  25.9250 |         |        S |
|          72 |        0 |      3 |      Goodwin, Miss. Lillian Amy | female | 16.0 |     5 |     2 |  CA 2144 |  46.9000 |         |        S |
|         391 |        1 |      1 |      Carter, Mr. William Ernest |   male | 36.0 |     1 |     2 |   113760 | 120.0000 | B96 B98 |        S |

342.0 out of 891 passengers survived.
109.0 out of 577 males survived.
233.0 out of 314 females survived.
```
