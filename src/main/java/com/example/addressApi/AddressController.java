package com.example.addressApi;
import org.apache.coyote.Response;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;
@CrossOrigin(origins = "http://127.0.0.1:5500") // Allow requests from Live Server
@RestController
@RequestMapping("/addresses")
public class AddressController {
    private ArrayList<Address> addresses = new ArrayList<>();
    private int size=0;
    // saving in memory for simplicity

    public AddressController(){
        addresses.add(new Address("Sweden","Stockholm","Muniplacity","testAddres1","https://cdn.lansfast-cdn.se/api/image/eyJpbWFnZVVybCI6Imh0dHBzOi8vc3RsYW5zZmFzdG1laWxpc2RldjAwMS5ibG9iLmNvcmUud2luZG93cy5uZXQvZm9yc2FsZWltYWdlcy9DTUJPTEdINUlHQlBFVjBGQ0U4VUQwTi9jYmlsZDVpbGJwc2kxdXYxODBlcjkuanBnIiwiZWRpdHMiOnsicmVzaXplIjp7ImZpdCI6ImNvdmVyIiwiaGVpZ2h0Ijo0MDAsIndpZHRoIjo3MDB9LCJqcGVnIjp7Im1vempwZWciOnRydWUsInF1YWxpdHkiOjgwfX19?signature=5e86daeeac3752e13a6656cced10c30afecfc8e10dea33f3780be22fc29e593e", "I det populära Örnäset i Luleå finns denna rymliga tegelvilla på en friköpt tomt som erbjuder gott om utrymme för hela familjen. Med fem rum, varav tre sovrum, och en boyta på 144 + 69 kvadratmeter finns det gott om plats att trivas på.\n" +
                "\n" +
                "Villan är byggd 1954 och har bevarat sin charm samtidigt som den erbjuder moderna bekvämligheter. Köket med tillhörande matsal blir en naturlig samlingsplats, medan det stora och ljusa vardagsrummet bjuder in till avkoppling.\n" +
                "\n" +
                "Förvaringsmöjligheterna är gott med flera förråd, ett garage och en carport. Dessutom finns ett uterum där man kan njuta av ljusa sommarkvällar. Eldstaden bidrar till en mysig atmosfär under vintermånaderna.\n" +
                "\n" +
                "Närområdet kännetecknas av lugn och trygghet med närhet till både natur och stad. Här finns fina promenadstråk och grönområden att njuta av, perfekt för den som uppskattar en aktiv livsstil.\n" +
                "\n" +
                "En unik möjlighet att förvärva en välbevarad tegelvilla med gott om plats och bekvämligheter. Välkommen hem!\n" +
                "Förbesiktat av Anticimex sam försäkras av säljaren mot dolda fel.\n" +
                "\n" +
                "Anmäl ert intresse redan nu för chans till förhandsvisning."));
        addresses.add(new Address("Sweden","Stockholm","Muniplacity","testAddres2","https://media.fastighetsbyran.se/44448099.jpg?Bredd=992", "Välkomna till Mardal och Nordgård 1och denna fastighet med hästanläggning i toppklass. Under årens lopp har nuvarande ägare lagt sin själ i att transformera den gamla bondgården till dess nuvarande form.\n" +
                "Här finns Stall med 15 boxar och nyinstallerad solcellsanläggning, två lösdrifter varav en även innehåller ytterligare fem boxar, ridhus med 21x63 m, ridbana om 30x 67, terrängbana, trav och galopp-spår om 1450 m (varav ca 480 m rakbana) samt skrittmaskin. På fastigheten finns också ladugård, maskinhall med isolerad verkstad samt bostadshus, även här är standarden mycket god!\n" +
                "\n" +
                "De 23 hektaren fördelar sig på ca 3,1 ha väldränerad betesmark i anslutning till gårdscentrat, 8,6 ha åker samt ca 6,1 ha skogsmark vilken till stor del utgörs av ungskog och innehåller ett totalt virkesförråd om ca 400 m³sk. Nuvarande ägare har också arrenderat ca 6 ha betesmark av närmsta grannen.\n" +
                "\n" +
                "Sammantaget en mångfacetterad hästfastighet med en imponerande välskött byggnadsmassa, såväl på verksamhetsnivå som privatbostad.\n" +
                "Bostadshuset är besiktigat av Anticimex och överlåtes med dolda-fel försäkring.\n" +
                "Kontakta oss gärna vid frågor, välkomna på visning !"));
        addresses.add(new Address("Sweden","Stockholm","Muniplacity","testAddres3","https://upload.wikimedia.org/wikipedia/commons/7/76/Riksv%C3%A4g76_Forsmark_160719.jpg","Nästan som en tvåa. Kök mot inglasad balkong. Balkong och vardagsrum har havsutsikt.\n" +
                "Sovalkov med plats för säng och garderob.\n" +
                "\n" +
                "Rymligt kök med plats för matbord och med utgång till balkongen. I anslutning till kök och hall finns sovalkoven.\n" +
                "\n" +
                "Duschrum med plats för högskåp. Tre garderober i hallen. Förråd och tvättstuga på samma våningsplan som lägenheten. Även ett förråd i källaren.\n" +
                "Lägenheten ligger på våning 1/7 och hiss finns.\n" +
                "\n" +
                "Bredband och Tv-bas ingår i månadsavgiften.\n" +
                "Lägre elkostnad då föreningen har gemensamt elavtal.\n" +
                "\n" +
                "Populär föreningen med gott om parkeringsplatser, motorvärmarplatser, laddstolpar samt varmgarage.\n" +
                "2 övernattningslägenheter finns att hyra till en billig penning. Även en fin festlokal är färdigställd inom kort.\n" +
                "\n" +
                "Som boende i Brf Strandparken har man även tillgång till bastu, biljardlokal, litet gym, snickeri, vävstuga, odlingslotter, bouleplan cykelrum, grovtvättstuga, uteplats med grill.\n" +
                "Trevlig strandpromenad och badstrand nedanför husen.\n" +
                "\n" +
                "Bra matvaruaffär finns i området.\n" +
                "Fina bussförbindelser till Njurunda och Sörberge.\n" +
                "15 minuter med buss till Stenstan.\n" +
                "30 minuter med buss direkt till Sundsvalls sjukhus.\n" +
                "\n" +
                "Välkomna på visning!"));
        addresses.add(new Address("Sweden","Stockholm","Muniplacity","testAddres4","https://bilder.hemnet.se/images/itemgallery_cut/cc/06/cc06ed89f6d9ec787b907b410edd8422.jpg","Drömmer du om en ståtlig villa med ett havsnära läge som bjuder på gammaldags charm och modern bekvämligheter? Då har du hittat rätt!\n" +
                "På Backegärdet 6, strax utanför centrala Hamburgsund finner vi detta rymliga hem som erbjuder 200 kvm av välplanerade ytor, perfekt för hela familjen.\n" +
                "Omfamnad av en stor, välskött tomt med lummig trädgård, växthus och vackra planteringar, är detta en dröm för den odlingsintresserade.\n" +
                "Här finns även en fungerande jordkällare.\n" +
                "\n" +
                "Husets entréplan inrymmer hall, badrum, sovrum, sällskapsrum, kök, tvättstuga samt kontor. Till tvättstugan har vi separat ingång från en skyddad terrass. I anslutning till sällskapsrummet tar vi oss enkelt ute till den tilltagna uteplatsen som bjuder på en vacker utsikt över havet. Här finns även ett inglasat uterum som värmer gott under kyligare kvällar och förlänger säsongen.\n" +
                "En trappa upp möts vi av en väl tilltaget sällskapsrum där man med fördel spenderar kvällarna vid matplatsen och njuter av solnedgången. På övervåningen finns även två sovrum, relax, badrum samt bastu.\n" +
                "\n" +
                "Njut av soliga dagar på den inbjudande uteplatsen med fantastisk havsutsikt. För båtägaren finns båtplats som öppnar dörren till den storslagna skärgården. Efter en dag till sjöss kan du koppla av i bastun eller vid eldstaden för en mysig kväll hemma. Inpå knuten finns även fina promenadstråk i vacker skogsmiljö med fina grillplatser vid tjärn samt härliga motionsspår.\n" +
                ".\n" +
                "Garaget rymmer två bilar och är utrustat med elbilsladdare, medan solcellerna på taket stödjer en hållbar livsstil. Källarens generösa förvaringsutrymme inkluderar även en vinkällare för finsmakaren.\n" +
                "i anslutning till garaget finns även ett gästhus på ca 40 kvm med två sovrum, sällskapsrum, badrum och kokvrå. Gästhuset erbjuder dessutom en praktisk kontorsplats för den som arbetar hemifrån, samt eldstad som höjer mysfaktorn,\n" +
                "\n" +
                "Med närhet till både bad och hav samt alla bekvämligheter inom räckhåll, balanserar detta hus komfort och naturupplevelser på ett fantastiskt sätt.\n" +
                "\n" +
                "Välkommen till Backegärdet 6, där varje detalj är noggrant utformad för att skapa ett harmoniskt liv vid kusten."));
        addresses.add(new Address("Sweden","Stockholm","Muniplacity","testAddres5","https://notar-media.b-cdn.net/objects/569JF9PU9AOU8KA2/images/S13279/JPG/1200/CBILD56DRSIRBFCMNN1KC.jpg", "Det vackert belägna och nyligen renoverade huset har tre sovrum varav två på övre plan, trevligt rymligt kök, kaklat duschrum/tvättstuga, vardagsrum och sovrum längst in på entréplan. Fastigheten är ansluten till kommunalt VA. Huset har renoverats med bl.a. ny el, nya parkettgolv, nya putsade innerväggar och tak, nytt duschrum och tvättstuga med tvättmaskin och torktumlare samt varmvattenberedare. Fönstren är bytta till 3-glas isoler. Köket har genomgått en stor renovering med ny isolerad betongplatta som underlag för golvet, nytt parkettgolv och installation av ett nyare begagnat kök med diskmaskin, spis och kyl/frysskåp samt luftvärmepump. På baksidan mot söder finns ett trädäck utanför entrén med bra plats för trädgårdsgrupp. Det finns ett uthus och parkeringsplats. Trevliga något sluttande tomten har äppelträd, päronträd, plommonträd, körsbärsträd, vinbär, krusbär och hallon samt perenner, såsom t.ex. rosor och pioner. Ca 100 m till båtplats vid brygga i Edeboviken. Välkomna till visning! Fastigheten överlåts med friskrivning.\n" +
                "\n"));
    }

    @GetMapping("/{id}")
    public Address Read(@PathVariable UUID id){
        Address ret =addresses.stream().filter(address -> address.getId().equals(id)).findFirst().orElse(null);
        return ret;
    }
    @GetMapping
    public ArrayList<Address> Read(){
        return addresses;
    }

    @PostMapping()
    public String Create (@RequestBody AddressDTO addressDTO){
        System.out.println("___POST ADDRESS___");
        System.out.println("Country: " + addressDTO.getCountry());
        System.out.println("City: " + addressDTO.getCity());
        System.out.println("Municipality: " + addressDTO.getMuniplacity());
        System.out.println("Street: " + addressDTO.getStreet());
        System.out.println("Image URL: " + addressDTO.getImageUrl());
        System.out.println("Description: " + addressDTO.getDescription());
        addresses.add(new Address(addressDTO.getCountry(), addressDTO.getCity(), addressDTO.getMuniplacity(), addressDTO.getStreet(), addressDTO.getImageUrl(), addressDTO.getDescription()));
        return "Address created successfully!";
    }

    @PutMapping()
    public String Edit (@RequestBody AddressDTO addressDTO){
        System.out.println("___PUT ADDRESS___");
        System.out.println("id: " + addressDTO.getId());
        System.out.println("Country: " + addressDTO.getCountry());
        System.out.println("City: " + addressDTO.getCity());
        System.out.println("Municipality: " + addressDTO.getMuniplacity());
        System.out.println("Street: " + addressDTO.getStreet());
        System.out.println("Image URL: " + addressDTO.getImageUrl());
        System.out.println("Description: " + addressDTO.getDescription());

        Address selected = addresses.stream()
                .filter(address -> address.getId().equals(addressDTO.getId()))
                .findFirst()
                .orElse(null);

       try {
           selected.setCountry(addressDTO.getCountry());
           selected.setCity(addressDTO.getCity());
           selected.setMuniplacity(addressDTO.getMuniplacity());
           selected.setStreet(addressDTO.getStreet());
           selected.setImageUrl(addressDTO.getImageUrl());
           selected.setDescription(addressDTO.getDescription());
       }
       catch (Error e){
           return "Address edit failed!";

       }
        return "Address edited successfully!";
    }

    @DeleteMapping()
    public String Delete(@RequestBody AddressDTO addressDTO) {
        System.out.println("___DELETE ADDRESS___");
        System.out.println("id: " + addressDTO.getId());

        Address selected = addresses.stream()
                .filter(address -> address.getId().equals(addressDTO.getId()))
                .findFirst()
                .orElse(null);

        if (selected == null) {
            return "Address not found!";
        }

        addresses.remove(selected);
        return "Address deleted successfully!";
    }
}
