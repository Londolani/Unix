
JAVAC = /usr/bin/javac
.SUFFIXES: .java .class

SRCDIR=src
BINDIR=bin

$(BINDIR)/%.class:$(SRCDIR)/%.java
	$(JAVAC) -d $(BINDIR)/ -cp $(BINDIR):$(SRCDIR): $<

CLASSES= DamArrsyApp.class 

CLASS_FILES=$(CLASSES:%.class=$(BINDIR)/%.class)


default: $(CLASS_FILES)
clean:
	rm $(BINDIR)/*.class

run:
	java -cp $(BINDIR) DamArrayApp  "Ngotwane Dam" "19.033" "4.6" > "DamArrayApp_output_printDam1.txt"
run2:
	java -cp $(BINDIR) DamArrayApp  "Hartbeespoort Dam" "186.44" "96.5" > "DamArrayApp_output_printDam2.txt"
run3: 
	java -cp $(BINDIR) DamArrayApp  "Bon Accord Dam" "4.381" "103" > "DamArrayApp_output_printDam3.txt"
run4: 
	java -cp $(BINDIR) DamArrayApp  > "output/DamArrayApp_output_printAllDams.txt"
run5: 
	java -cp $(BINDIR) DamArrayApp "Name Dam" "520.5" "15" > "DamArrayApp_output_printDam4.txt"
run6: 
	java -cp $(BINDIR) DamArrayApp  "Zaio Dam" "14" "2.6" > "DamArrayApp_output_printDam5.txt"
run7: 
	java -cp $(BINDIR) DamArrayApp  "Inval Dam" "2.5" "0.3"  > "DamArrayApp_output_printDam6.txt"
