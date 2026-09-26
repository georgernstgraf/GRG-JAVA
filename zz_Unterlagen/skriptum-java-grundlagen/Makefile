# plantuml -tsvg skript2.md
# erzeugt datei skript2
#
# siehe: https://gist.github.com/noamtamim/f11982b28602bd7e604c233fbe9d910f
#
#
all: cha

markdown:
	pandoc -s -V geometry:margin=1in -o skriptum.pdf skriptum.md


convertMarkdownToAscidoc:
	pandoc -t asciidoc -f markdown skriptum.md > skriptum.adoc


# On Ubuntu dont use asciidoctor-pdf from apt-get, but use gem instead!
# Make sure to pure asciidoctor-pdf in apt-get!
# sudo gem install asciidoctor-pdf --pre
#
# install syntax highlighting packages
# sudo apt-get install ruby-rouge
#
#
ad2pdf:
	asciidoctor-pdf -a toc --doctype book skriptum.adoc -o skriptum.pdf

ad2html:
	asciidoctor -a toc --doctype book skriptum.adoc

cha:
	asciidoctor-pdf -a pdf-theme="ressources/themes/cha-cc-slm-theme.yml" -a pdf-fontsdir=ressources/fonts/ -v -a toc --doctype book skriptum.adoc -o skriptum.pdf

	
	
slm:
	asciidoctor-pdf -a pdf-theme="slm-theme.yml" -a pdf-fontsdir=fonts/ -v -a toc --doctype book skriptum.adoc -o skriptum.pdf

	
slm2:
	asciidoctor-pdf -a toc -r asciidoctor-diagram -r asciidoctor-lists -r slm-rouge-theme.rb -a pdf-theme=slm-theme.yml --doctype book skriptum.adoc -o skriptum.pdf

