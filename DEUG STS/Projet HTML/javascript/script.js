function affdate(){
var date = new Date();
var nbjour = date.getDate();
var annee = date.getFullYear();
var mois = date.getMonth()
  switch (mois) {
    case 0: mois = "janvier";break;
    case 1: mois = "février";break;
    case 2: mois = "mars";break;
    case 3: mois = "avril";break;
    case 4: mois = "mai";break;
    case 5: mois = "juin";break;
    case 6: mois = "juillet";break;
    case 7: mois = "août";break;
    case 8: mois = "septembre";break;
    case 9: mois = "octobre";break;
    case 10: mois = "novembre";break;
    case 11: mois = "décembre";break;
    default: alert("Pas de mois...");
  }
var jour = date.getDay();
  switch (jour) {
    case 0: jour = "dimanche";break;
    case 1: jour = "lundi";break;
    case 2: jour = "mardi";break;
    case 3: jour = "mercredi";break;
    case 4: jour = "jeudi";break;
    case 5: jour = "vendredi";break;
    case 6: jour = "samedi";break;
    default: alert("Pas de jour...");
  }
document.getElementById('date').innerHTML += jour+" "+nbjour+" "+mois+" "+annee;
}

function info(nat, initiale) {
    switch (nat) {
      case 18: switch (initiale) {  //Spetsnaz/RUSSE
        case 11: {  //kapkan
          init();
          document.getElementById('agent').innerHTML += 'Kapkan';
          document.getElementById('nom').innerHTML += ' BASUDA';
          document.getElementById('prenom').innerHTML += ' Maxim';
          document.getElementById('unite').innerHTML += ' Spetsnaz';
          document.getElementById('ddn').innerHTML += ' 14 mai 1981';
          document.getElementById('ldn').innerHTML += ' Kovrov, Russie';
          document.getElementById('biographie').innerHTML += " Basuda est né et a grandi à Kovrov. C'est l'aîné de trois garçons, dont les parents étaient ouvriers à l'usine. Désireux d'échapper à une vie monotone, il s'est engagé auprès du ministère des affaires intérieures et a été envoyé à Naryan Mar, un petit port maritime et fluvial de la mer de Barents. Pendant ce séjour dans le cercle arctique, il est devenu un chasseur et un trappeur passionné. Il a été ensuite muté à Beslan, en 2002."
          document.getElementById('sdj').innerHTML += " Kapkan est un agent spécialisé dans les pièges, un atout mortel pour toute équipe de défenseurs. Kapkan est équipé d'un dispositif de blocage (EDD-MK II). Ce piège est en réalité une charge remplie de C4 qui s'active grâce à un système de détection de mouvements. Il peut être placé sur l'encadrement d'une porte ou d'une fenêtre afin de bloquer les points d'entrée des assaillants."
        }break;
        case 20: {  //tachanka
          init();
          document.getElementById('agent').innerHTML += 'Tachanka';
          document.getElementById('nom').innerHTML += ' SENAVIEV';
          document.getElementById('prenom').innerHTML += ' Alexsandr';
          document.getElementById('unite').innerHTML += ' Spetsnaz';
          document.getElementById('ddn').innerHTML += ' 3 novembre 1967';
          document.getElementById('ldn').innerHTML += ' Saint Pétersbourg, Russie';
          document.getElementById('biographie').innerHTML += " Iconoclaste dans l'âme, Alexsandr Senaviev a grandi dans une famille pro-armée rouge avant que la politique de la 'glasnost' ne soit mise en place. Il a toujours montré un intérêt certain pour l'artillerie et l'armement soviétiques."
          document.getElementById('sdj').innerHTML += " À tel point que lors de ses opérations, il se sert d'une mitrailleuse vintage qu'il a lui-même restaurée et qu'il entretient avec amour."
        }break;
        case 6 : { //fuze
          init();
          document.getElementById('agent').innerHTML += 'Fuze';
          document.getElementById('nom').innerHTML += ' KESSIKBAYEV';
          document.getElementById('prenom').innerHTML += ' Shuhrat';
          document.getElementById('unite').innerHTML += ' Spetsnaz';
          document.getElementById('ddn').innerHTML += ' 12 octobre';
          document.getElementById('ldn').innerHTML += ' Samarkand, Ouzbékistan';
          document.getElementById('biographie').innerHTML += " Kessikbayev a grandi dans une famille de militaires à Samarcande, en Ouzbékistan. Sa famille a rejoint la Russie peu après l'effondrement de l'Union soviétique, et Kessikbayev a suivi les traces de son père pour s'engager dans les forces armées. Là, ses talents en matière de technologies lui ont valu un poste dans la très convoitée brigade d'essais d'armements du polygone de tir d'Alabino, près de Moscou."
          document.getElementById('sdj').innerHTML += " Fuze est plus efficace dans son rôle de déni de zone et s'il est agressif sur les flancs. Ses forces lui permettent de déployer des capacités défensives et de harceler les ennemis ancrés dans des positions défensives. Ses charges à sous-munitions APM-6 déclenchent un groupe de petites grenades explosives à travers les surfaces fragiles.";
        }break;
        case 7 : { //glaz
          init();
          document.getElementById('agent').innerHTML += 'Glaz';
          document.getElementById('nom').innerHTML += ' GLAZKOV';
          document.getElementById('prenom').innerHTML += ' Timur';
          document.getElementById('unite').innerHTML += ' Spetsnaz';
          document.getElementById('ddn').innerHTML += ' 2 juillet 1989';
          document.getElementById('ldn').innerHTML += ' Vladivostok, Russie';
          document.getElementById('biographie').innerHTML += " Glazkov est né et a grandi à Vladivostok, où son père travaillait dans l'industrie navale. Au lycée, il a étudié l'art jusqu'à ce que l'affaire des otages de l'école de Beslan l'incite à rejoindre le corps des cadets et à commencer une carrière dans les forces armées."
          document.getElementById('sdj').innerHTML += " Glaz est un tireur d'élite d'arrière-garde, capable d'effectuer des brèches et de couvrir ses alliés à distance. Glaz peut tirer de loin grâce à son aptitude de visée unique : la Visée auxiliaire HDS.";
        }break;
        default: alert("Problème avec les russes")
      }break;
      case 6: switch (initiale) { //GIGN / FRANCE
        case 4 : { //doc
          init();
          document.getElementById('agent').innerHTML += 'Doc';
          document.getElementById('nom').innerHTML += ' KATEB';
          document.getElementById('prenom').innerHTML += ' Gustave';
          document.getElementById('unite').innerHTML += ' GIGN';
          document.getElementById('ddn').innerHTML += ' 16 septembre 1977';
          document.getElementById('ldn').innerHTML += ' Paris, France';
          document.getElementById('biographie').innerHTML += " Kateb a grandi dans une famille riche du 16ème arrondissement de Paris. À 20 ans, il a abandonné ses études de médecine générale pour se lancer dans une carrière au Service de santé des armées. ";
          document.getElementById('sdj').innerHTML += " Gustave Kateb est une personne d'exception : un véritable altruiste, un idéaliste désirant créer un monde plus sûr. Volontaire pour Médecins sans frontières et officier médical de la Brigade des forces spéciales Terre, c'est un médecin de terrain efficace qui transporte un pistolet stim capable de réanimer à distance ses équipiers blessés.";
        }break;
        case 18 : { //rook
          init();
          document.getElementById('agent').innerHTML += 'Rook';
          document.getElementById('nom').innerHTML += ' NIZAN';
          document.getElementById('prenom').innerHTML += ' Julien';
          document.getElementById('unite').innerHTML += ' GIGN';
          document.getElementById('ddn').innerHTML += ' 6 janvier 1992';
          document.getElementById('ldn').innerHTML += ' Tours, France';
          document.getElementById('biographie').innerHTML += " À l'école, Nizan excellait en sport, et tout particulièrement en athlétisme. Benjamin d'une famille modeste, il s'est engagé dans la Gendarmerie nationale à l'âge de dix-huit ans et s'est retrouvé affecté à une unité routière. Durant son instruction élémentaire, Nizan a découvert qu'il était doué pour le tir, une compétence qu'il a continué à développer durant son séjour dans la Gendarmerie. Son talent au fusil a attiré l'attention du GIGN."
          document.getElementById('sdj').innerHTML += " Rook est une ancre et un agent de buff, capable d'octroyer des bonus aux défenseurs, pour leur donner un avantage de taille lors des combats. Rook peut protéger ses équipiers et lui-même grâce à son aptitude unique : les protections R1N 'RHINO'.";
        }break;
        case 20 : { //twitch
          init();
          document.getElementById('agent').innerHTML += 'Twitch';
          document.getElementById('nom').innerHTML += ' PICHON';
          document.getElementById('prenom').innerHTML += ' Emmanuelle';
          document.getElementById('unite').innerHTML += ' GIGN';
          document.getElementById('ddn').innerHTML += ' 12 octobre 1991';
          document.getElementById('ldn').innerHTML += ' Nancy, France';
          document.getElementById('biographie').innerHTML += " Née dans la ville historique de Nancy, Pichon a grandi dans une famille accordant une grande importance à l'éducation, et en particulier aux sciences et aux mathématiques. Très vite, elle a participé à des concours de programmation puis rejoint un établissement d'enseignement militaire dès l'âge de seize ans."
          document.getElementById('sdj').innerHTML += " Twitch est un agent de neutralisation et de renseignements. Elle peut être efficace en soutien d'arrière-garde ou en se montrant agressive en ouverture. Twitch peut désactiver des appareils à distance avec son aptitude unique : le drone à électrocution RSD Model 1.";
        }break;
        case 13 : { //montagne
          init();
          document.getElementById('agent').innerHTML += 'Montagne';
          document.getElementById('nom').innerHTML += ' TOURÉ';
          document.getElementById('prenom').innerHTML += ' Gilles';
          document.getElementById('unite').innerHTML += ' GIGN';
          document.getElementById('ddn').innerHTML += ' 11 octobre 1968';
          document.getElementById('ldn').innerHTML += ' Bordeaux, France';
          document.getElementById('biographie').innerHTML += " Vétéran de la Gendarmerie nationale, Gilles Touré est le plus ancien agent en service du GIGN. Extrêmement protecteur vis-à-vis de ses équipiers, ce gentil géant n'hésitera pas à se jeter au-devant d'une balle pour protéger un autre agent. Le grand bouclier anti-émeute dont il est équipé date des années 1980 et a connu plus de missions que la plupart des agents. "
          document.getElementById('sdj').innerHTML += " Montagne est l'homme de pointe idéal pour percer les lignes ennemies : il peut étendre son bouclier afin d'être protégé de la tête aux pieds en position debout, tout en offrant un abri à ceux qui sont derrière lui.";
        }break;
        default:  alert("Problème avec les français")
      }break;
      case 21 : switch (initiale) { //USA
        case 3 : { //castle
          init();
          document.getElementById('agent').innerHTML += 'Castle';
          document.getElementById('nom').innerHTML += ' CAMPBELL';
          document.getElementById('prenom').innerHTML += ' Miles';
          document.getElementById('unite').innerHTML += ' SWAT';
          document.getElementById('ddn').innerHTML += ' 20 septembre 1983';
          document.getElementById('ldn').innerHTML += ' Sherman Oaks, Californie';
          document.getElementById('biographie').innerHTML += " Diplômé de la Cal State LA, Campbell possède une licence en droit pénal. Il a ainsi rapidement rejoint la police de Los Angeles. Au bout de cinq ans, il a été affecté à l'équipe SWAT du LAPD, où il a excellé pendant trois ans avant de se faire muter au FBI. Campbell y a passé deux ans en tant qu'agent de terrain, puis a rejoint une équipe SWAT du FBI.";
          document.getElementById('sdj').innerHTML += " Castle est un agent de sécurisation pouvant servir d'ancre, et capable de créer des forteresses défensives autour de l'objectif, afin de ralentir les assaillants. L'aptitude unique de Castle permet de créer des barricades renforcées en utilisant le panneau tactique universel UTP1.";
        }break;
        case 16 : { //pulse
          init();
          document.getElementById('agent').innerHTML += 'Pulse';
          document.getElementById('nom').innerHTML += ' ESTRADA';
          document.getElementById('prenom').innerHTML += ' Jack';
          document.getElementById('unite').innerHTML += ' SWAT';
          document.getElementById('ddn').innerHTML += ' 11 octobre 1987';
          document.getElementById('ldn').innerHTML += ' Goldsboro, Caroline du Nord';
          document.getElementById('biographie').innerHTML += " Fils de Cynthia Estrada et Mark Peterson, né sur la base aérienne Seymour Johnson, Jack a grandi dans le milieu militaire. Suivant les traces de sa mère, il est devenu officier de renseignement.";
          document.getElementById('sdj').innerHTML += " Pulse est un patrouilleur et un agent de renseignements au service des défenseurs. Il peut traquer les assaillants à travers les murs grâce à son capteur cardiaque HB-5 et obtenir de précieuses informations sur leur position.";
        }break;
        case 20 : { //thermite
          init();
          document.getElementById('agent').innerHTML += 'Thermite';
          document.getElementById('nom').innerHTML += ' TRACE';
          document.getElementById('prenom').innerHTML += ' Jordan';
          document.getElementById('unite').innerHTML += ' SWAT';
          document.getElementById('ddn').innerHTML += ' 14 mars 1984';
          document.getElementById('ldn').innerHTML += ' Plano, Texas';
          document.getElementById('biographie').innerHTML += " Trace a rejoint les Marines après le lycée et a effectué deux séjours en Irak. Après avoir quitté l'USMC, il a utilisé son pécule pour décrocher une licence de chimie (Texas A&M). Il est ensuite entré au FBI. Après quatre années comme agent de terrain, il a été transféré au SWAT.";
          document.getElementById('sdj').innerHTML += " Thermite est une importante ligne de fond dans le soutien de l'équipe en attaque. Puisqu'il est l'un des seuls agents du jeu à être spécialisé dans l'ouverture de brèches, perdre Thermite au début de la manche entravera énormément votre équipe. Jouer Thermite requiert beaucoup de patience et des qualités de meneur, ainsi qu'une grande communication avec votre équipe.";
        }break;
        case 1 : { //ash
          init();
          document.getElementById('agent').innerHTML += 'Ash';
          document.getElementById('nom').innerHTML += ' COHEN';
          document.getElementById('prenom').innerHTML += ' Eliza';
          document.getElementById('unite').innerHTML += ' SWAT';
          document.getElementById('ddn').innerHTML += ' 24 décembre 1986';
          document.getElementById('ldn').innerHTML += ' Jérusalem, Israël';
          document.getElementById('biographie').innerHTML += " Cohen est née et a grandi à Jérusalem. Après le lycée, elle a rejoint l'université de Tel Aviv, pour y suivre les cours d'ingénierie. Pendant ses études, elle a passé un semestre à l'université de Boston. Elle a ensuite fait son service militaire dans les forces de défense israéliennes. Sa formation en ingénierie en a fait une candidate idéale pour l'entretien mécanique et la démolition.";
          document.getElementById('sdj').innerHTML += " Ash est un agent rapide de première ligne, capable de s'infiltrer discrètement, de contourner l'ennemi ainsi que de détourner l'attention des défenseurs en quelques secondes. Ash est capable de s'infiltrer discrètement et à distance grâce à son M120 CREM modifié et ses munitions d'infiltration.";
        }break;
        default:  alert("Problème avec le SWAT")
      }break;
      case 1: switch (initiale) { //UK
        case 13 : { //mute
          init();
          document.getElementById('agent').innerHTML += 'Mute';
          document.getElementById('nom').innerHTML += ' CHANDAR';
          document.getElementById('prenom').innerHTML += ' Mark';
          document.getElementById('unite').innerHTML += ' SAS';
          document.getElementById('ddn').innerHTML += ' 11 octobre 1991';
          document.getElementById('ldn').innerHTML += ' York, Angleterre';
          document.getElementById('biographie').innerHTML += " Vétéran du Siège des communications gouvernementales (GCHQ) britanniques, le travail remarquable de Mark Chandar en tant que spécialiste des renseignements a fait de lui une recrue de choix pour Rainbow.";
          document.getElementById('sdj').innerHTML += " Il dispose d'un brouilleur de signaux issu de son ancien poste, qui lui permet d'empêcher toute communication dans une zone donnée, ainsi que les détonations à distance et l'utilisation de drones. Le GC90 'Moni', bloque le signal d'une détonation à distance et l'empêche d'atteindre un appareil situé dans sa zone d'effet.";
        }break;
        case 190 : { //smoke 19[0]
          init();
          document.getElementById('agent').innerHTML += 'James';
          document.getElementById('nom').innerHTML += ' PORTER';
          document.getElementById('prenom').innerHTML += ' James';
          document.getElementById('unite').innerHTML += ' SAS';
          document.getElementById('ddn').innerHTML += ' 14 mai 1990';
          document.getElementById('ldn').innerHTML += ' Londres, Angleterre';
          document.getElementById('biographie').innerHTML += " Porter est un casse-cou qui ne se préoccupe guère de sa propre sécurité. Il est intrépide au combat et peut être un atout considérable lors de manœuvres défensives, bien qu'il semble apprécier le chaos de la guerre. ";
          document.getElementById('sdj').innerHTML += " Il utilise une mine télécommandée remplie de gaz composés pour empêcher les ennemis d'avancer.";
        }break;
        case 20 : { //tatcher
          init();
          document.getElementById('agent').innerHTML += 'Tatcher';
          document.getElementById('nom').innerHTML += ' BAKER';
          document.getElementById('prenom').innerHTML += ' Mike';
          document.getElementById('unite').innerHTML += ' SAS';
          document.getElementById('ddn').innerHTML += ' 22 juin 1961';
          document.getElementById('ldn').innerHTML += ' Bideford, Angleterre';
          document.getElementById('biographie').innerHTML += " Né dans une famille de dockers, Baker s'est engagé dans les forces armées le jour de ses dix-huit ans. Vétéran de trois conflits, Baker était le plus vieil agent du SAS en service actif lors de son recrutement par Rainbow.";
          document.getElementById('sdj').innerHTML += " Baker est très observateur, calculateur et déterminé. Parfois impatient et de cynique, il possède un sens profond des responsabilités et de l'éthique. Il est recommandé d'affecter Baker à de jeunes agents aux fortes convictions morales, auxquels il servira de mentor.";
        }break;
        case 191 : { //sledge 19[0]
          init();
          document.getElementById('agent').innerHTML += 'Sledge';
          document.getElementById('nom').innerHTML += ' COWDEN';
          document.getElementById('prenom').innerHTML += ' Seamus';
          document.getElementById('unite').innerHTML += ' SAS';
          document.getElementById('ddn').innerHTML += " 2 avril 1984";
          document.getElementById('ldn').innerHTML += " John O'groats, Écosse";
          document.getElementById('biographie').innerHTML += " Seamus Cowden est originaire du sommet des Highlands. En raison de sa présence imposante et de sa nature athlétique, il est devenu en 1998 capitaine de l'équipe d'Écosse de rugby dans la catégorie des moins de vingt ans. Son désir de servir l'a amené à s'engager dans l'armée dès l'âge de dix-huit ans, et il a été recruté par le S.A.S. cinq ans plus tard.";
          document.getElementById('sdj').innerHTML += " Sledge est un agent de brèche et de contournement, il est idéal pour créer de nouvelles lignes de tir et des points d'entrée, tout en harcelant les défenseurs. Sledge peut effectuer des brèches sur les surfaces non-renforcées grâce à sa masse de brèche tactique : le Tronc.";
        }break;
        default:  alert("Problème avec les anglais")
      }break;
      case 4: switch (initiale) { //deutch
        case 10 : { //jager
          init();
          document.getElementById('agent').innerHTML += 'Jäger';
          document.getElementById('nom').innerHTML += ' STREICHER';
          document.getElementById('prenom').innerHTML += ' Marius';
          document.getElementById('unite').innerHTML += ' GSG9';
          document.getElementById('ddn').innerHTML += ' 9 mars 1980';
          document.getElementById('ldn').innerHTML += ' Düsseldorf, Allemagne';
          document.getElementById('biographie').innerHTML += " Élevé par son oncle, mécanicien du groupement d'aviation de la Bundespolizei (BPOL) après la réunification, Streicher a rejoint la BPOL en tant que technicien sur hélicoptère. Là, il a commencé à concevoir des systèmes d'armes défensifs, dont un prototype de système de défense active qui a attiré l'attention du GSG 9.";
          document.getElementById('sdj').innerHTML += " Jäger peut aider son équipe à créer une forte position défensive avant de patrouiller sur la carte pour intercepter les assaillants spécialisés dans la prise en tenaille. Il est capable de détruire les projectiles en approche grâce à son gadget déployable unique : le système de défense active, ou ADS.";
        }break;
        case 20 : { //bandit 2[0]
          init();
          document.getElementById('agent').innerHTML += 'Bandit';
          document.getElementById('nom').innerHTML += ' BRUNSMEIER';
          document.getElementById('prenom').innerHTML += ' Dominic';
          document.getElementById('unite').innerHTML += ' GSG9';
          document.getElementById('ddn').innerHTML += ' 13 août 1977';
          document.getElementById('ldn').innerHTML += ' Berlin, Allemagne';
          document.getElementById('biographie').innerHTML += " Brunsmeier et son frère jumeau Cedrick ont rejoint le Bundesgrenzschutz (BGS) le lendemain de leur dix-huitième anniversaire. Brunsmeier a passé sa première année chez les gardes-frontières à s'accoutumer à la discipline et à remplir de la paperasse.";
          document.getElementById('sdj').innerHTML += " Efficace en anti-brèche lourde, patrouille et sécurisation, Bandit est capable d'empêcher les assaillants de franchir des points stratégiques et de défendre l'objectif tout en se déplaçant. Bandit peut électrifier différentes surfaces grâce à son aptitude spéciale : le Dispositif électrique rustique ou fil électrifié CED-1.";
        }break;
        case 9 : { //iq
          init();
          document.getElementById('agent').innerHTML += 'IQ';
          document.getElementById('nom').innerHTML += ' WEISS';
          document.getElementById('prenom').innerHTML += ' Monika';
          document.getElementById('unite').innerHTML += ' GSG9';
          document.getElementById('ddn').innerHTML += ' 1 août 1979';
          document.getElementById('ldn').innerHTML += ' Leipzig, Allemagne';
          document.getElementById('biographie').innerHTML += " Perfectionniste et vive, Monika Weiss se révèle très douée dans tout ce qu'elle entreprend. Après des études à l'Ivy League en ingénierie électrique et un premier service dans les unités aériennes et techniques du GSG 9, elle utilise un appareil pouvant détecter les pièges et gadgets électroniques à distance. ";
          document.getElementById('sdj').innerHTML += " Le gadget d'IQ est très utile pour désactiver les appareils de brouillage à travers des barricades afin de permettre à vos équipiers de poser des charges librement.";
        }break;
        case 21 : { //blitz 2[0]
          init();
          document.getElementById('agent').innerHTML += 'Blitz';
          document.getElementById('nom').innerHTML += ' KÖTZ';
          document.getElementById('prenom').innerHTML += ' Elias';
          document.getElementById('unite').innerHTML += ' GSG9';
          document.getElementById('ddn').innerHTML += ' 2 avril 1980';
          document.getElementById('ldn').innerHTML += ' Brême, Allemagne';
          document.getElementById('biographie').innerHTML += " Célèbre pour sa tendance à utiliser l'humour afin de détendre l'atmosphère, Elias Kötz transporte un appareil peu commun en mission : un bouclier anti-émeute équipé de grenades flash capables d'étourdir les ennemis tout en restant protégé.";
          document.getElementById('sdj').innerHTML += " Blitz est très efficace en première ligne : avec son bouclier Flash, il peut aveugler les cibles à portée qui regardent dans sa direction, ce qui les rend vulnérables aux tirs des alliés qui l'accompagnent.";
        }break;
        default:  alert("Problème avec les allemands")
      }break;
      default: alert("Problème général");
    }
}

function init(){
  document.getElementById('agent').innerHTML = 'Identité de ';
  document.getElementById('nom').innerHTML = '<span style="text-decoration: underline;font-weight: bold;">Nom :</span>';
  document.getElementById('prenom').innerHTML = '<span style="text-decoration: underline;font-weight: bold;">Prénom :</span>';
  document.getElementById('unite').innerHTML = '<span style="text-decoration: underline;font-weight: bold;">Unité :</span>';
  document.getElementById('ddn').innerHTML = '<span style="text-decoration: underline;font-weight: bold;">Date de naissance :</span>';
  document.getElementById('ldn').innerHTML = '<span style="text-decoration: underline;font-weight: bold;">Lieu de naissance :</span>';
  document.getElementById('biographie').innerHTML = '<span style="text-decoration: underline;font-weight: bold;">Biographie :</span>';
  document.getElementById('sdj').innerHTML = '<span style="text-decoration: underline;font-weight: bold;">Style de jeu :</span>';
}

function valideform(formulaire){
  var alphap = /[A-Za-z -]/;
  var mailp = /.+@.+\..+/;
  var telp = /0{1}[0-9]{9,9}/;
  var nom = document.getElementById('nom');
  var prenom = document.getElementById('prenom');
  var email = document.getElementById('email');
  var tel = document.getElementById('tel');
  var colorc = document.getElementById('colorb');
  var rappel = document.getElementById('rappel');

  if (alphap.test(nom.value) == true) {
    nom.style.border = "1.3px solid black";
    rappel.innerHTML = "";
    if (alphap.test(prenom.value) == true) {
      prenom.style.border = "1.3px solid black";
      rappel.innerHTML = "";
      if (mailp.test(email.value) == true) {
        email.style.border = "1.3px solid black";
        rappel.innerHTML = "";
        if (telp.test(tel.value) == true) {
          tel.style.border = "1.3px solid black";
          rappel.innerHTML = "";
          document.getElementById('formcontact').submit();
        }
        else {
          tel.style.border = "2px solid red";
          rappel.innerHTML = "Vérfifiez vos informations !"
        }
      }
      else {
        email.style.border = "2px solid red";
        rappel.innerHTML = "Vérfifiez vos informations !"
      }
    }
    else {
      prenom.style.border = "2px solid red";
      rappel.innerHTML = "Vérfifiez vos informations !"
    }
  }
  else {
    nom.style.border = "2px solid red";
    rappel.innerHTML = "Vérfifiez vos informations !"
  }
}

function changecolor() {
  var newcolor = document.getElementById('colorb').value;
  document.body.style.backgroundColor = newcolor;
}

function modiflien(index){
  var id = "m"+index;
  document.getElementById(id).style.color = '#AF2CFF';
}
