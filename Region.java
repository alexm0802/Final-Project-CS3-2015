import java.util.*;
public class Region
{
   private List<String> countries;
   private String regionName;
   private String preferredCountry = null;
   private int preference;
   public Region(ArrayList<String> countries, String regionName, String preferredCountry, int preference)
   {
      this.countries = countries;
      this.regionName = regionName;
      this.preferredCountry = preferredCountry;
      this.preference = preference;
   }
   
   public Region(ArrayList<String> countries, String regionName)
   {
      this(countries, regionName, null, 0);
   }
   
   public String getName()
   {
      return regionName;
   }
   
   public String getPreference()
   {
      return preferredCountry;
   }
   
   public List<String> getCountries()
   {
      return countries;
   }
   
   public boolean equals(Object other)
   {
      if(this.equalsWithoutPreference(other))
      {
         Region r = (Region) other;
         if(r.getPreference().equals(preferredCountry))
         {
            return true;
         }
      }
      return false;
   }
   
   public boolean equalsWithoutPreference(Object other)
   {
      if(other instanceof Region)
      {
         Region r = (Region) other;
         if(r.getName().equals(regionName)&&r.getCountries().equals(countries))
         {
            return true;
         }
      }
      return false;
   }
}