val ScalaJSVersion = Option(System.getenv("SCALAJS_VERSION")).filter(_.nonEmpty).getOrElse("1.10.0")

addSbtPlugin("com.github.tkawachi"       % "sbt-doctest"                   % "0.10.0")
addSbtPlugin("com.47deg"                 % "sbt-microsites"                % "1.3.4")
addSbtPlugin("com.dwijnand"              % "sbt-dynver"                    % "4.1.1")
addSbtPlugin("com.github.sbt"            % "sbt-unidoc"                    % "0.5.0")
addSbtPlugin("com.github.sbt"            % "sbt-pgp"                       % "2.2.0")
addSbtPlugin("com.typesafe"              % "sbt-mima-plugin"               % "1.1.1")
addSbtPlugin("de.heikoseeberger"         % "sbt-header"                    % "5.8.0")
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat"                  % "0.3.1")
addSbtPlugin("org.portable-scala"        % "sbt-scalajs-crossproject"      % "1.3.2")
addSbtPlugin("org.scala-js"              % "sbt-scalajs"                   % ScalaJSVersion)
addSbtPlugin("org.scalameta"             % "sbt-mdoc"                      % "2.3.8")
addSbtPlugin("org.scoverage"             % "sbt-scoverage"                 % "1.9.3")
addSbtPlugin("org.xerial.sbt"            % "sbt-sonatype"                  % "3.9.21")
