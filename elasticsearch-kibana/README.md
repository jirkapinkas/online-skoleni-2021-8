V adresari kde se nachazi docker-compose.yml volame vsechny docker a docker-compose prikazy:


# Spusteni:

    docker-compose up -d

# Funguje:

Elasticsearch: http://localhost:9200

Kibana: http://localhost:5601

Dejavu: http://localhost:1358/
Je nutné nastavit URL: http://localhost:9200 a index: kibana_sample_data_logs

# Vypnuti & smazani:

    docker-compose down

# Jenom vypnout (bez smazani). Poznamka: Staci i restartovat pocitac, neni nastaveny autostart u kontejneru: 

    docker-compose stop

# Jenom zapnout (napriklad po restartu pocitace): 

    docker-compose start

# Vycisteni mista na disku:

    docker-compose down
    docker image prune --all
    docker volume prune
    docker system prune
