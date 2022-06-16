use jgflix2022
;

select DVDID, DVDName, YearRlsd
from dvds
;

select DVDID, DVDName, YearRlsd
from dvds
where YearRlsd = '2019'
;

select DVDID, DVDName, NumDisks
from dvds
where NumDisks > 1
;

select D.DVDID as 'DVD No.', D.DVDName as 'DVD Name', D.NumDisks as 'Number of Disk'
from dvds as D
where D.NumDisks > 1
;